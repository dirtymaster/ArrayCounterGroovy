package arraycounter.groovy

class BootStrap {
    def init = { servletContext ->
        def port = System.getProperty('server.port', '8080')
        def url = "http://localhost:" + port + "/array/index"
        def os = System.getProperty('os.name').toLowerCase()

        def command = []
        if (os.contains('win')) {
            command = ['rundll32', 'url.dll,FileProtocolHandler']
        } else if (os.contains('mac')) {
            command = ['open']
        } else if (os.contains('nix') || os.contains('nux')) {
            command = ['xdg-open']
        }

        if (command) {
            command.add(url)
            try {
                new ProcessBuilder(command).start()
            } catch (IOException e) {
                println "Error opening browser: ${e.message}"
            }
        } else {
            println "Unsupported OS for automatic browser opening"
        }
    }
    def destroy = {
    }
}