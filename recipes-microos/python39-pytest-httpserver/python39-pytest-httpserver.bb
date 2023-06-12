SUMMARY = "A HTTP server for pytest"
DESCRIPTION = "This library is for testing HTTP clients without contacting the real \
HTTP server. In other words, it is a fake HTTP server which is \
accessible via localhost can be started with the pre-defined expected \
HTTP requests and their responses."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python39-pytest-httpserver-1.0.8-1.1.noarch.rpm"
RPM_HASH = "74ba1bd2d100e69d06e525bf43abf100dbb6c9856f704f4d94d3bd818bea10f6264e2396c549ceb5d5a7e9783c7b97c43ca5bd23dae6f34ab83bfcead29876e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-httpserver) \
python39-pytest-httpserver \
python3dist(pytest-httpserver)"
RDEPENDS:${PN} += "python(abi) \
python39-Werkzeug \
python39-pytest"

inherit rpm
