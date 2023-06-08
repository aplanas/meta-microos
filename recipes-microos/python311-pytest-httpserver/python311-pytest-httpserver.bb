SUMMARY = "A HTTP server for pytest"
DESCRIPTION = "This library is for testing HTTP clients without contacting the real \
HTTP server. In other words, it is a fake HTTP server which is \
accessible via localhost can be started with the pre-defined expected \
HTTP requests and their responses."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python311-pytest-httpserver-1.0.6-1.1.noarch.rpm"
RPM_HASH = "9ab2ff6a016b27d3e8928e38fb8c134b9d2cfd96d3ebe34b14baf8a5760bd31ccc45053fab328758e58098e741c621c002d52b8a0b66f78039ed0d3e3d900983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-httpserver) python311-pytest-httpserver python3dist(pytest-httpserver)"
RDEPENDS:${PN} += "python(abi) python311-Werkzeug python311-pytest"

inherit rpm
