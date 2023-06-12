SUMMARY = "A HTTP server for pytest"
DESCRIPTION = "This library is for testing HTTP clients without contacting the real \
HTTP server. In other words, it is a fake HTTP server which is \
accessible via localhost can be started with the pre-defined expected \
HTTP requests and their responses."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python311-pytest-httpserver-1.0.8-1.1.noarch.rpm"
RPM_HASH = "d31af022f8b6d6a7d0704e8625d8fc723d0dbdbc8ac6171f557ea3cce1ae82902881e6c930a69c54289ba6c969ac8faa2120403dc80076d4d892a51c9af90b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-httpserver) python311-pytest-httpserver python3dist(pytest-httpserver)"
RDEPENDS:${PN} += "python(abi) python311-Werkzeug python311-pytest"

inherit rpm
