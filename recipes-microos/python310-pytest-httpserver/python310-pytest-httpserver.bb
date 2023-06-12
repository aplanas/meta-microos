SUMMARY = "A HTTP server for pytest"
DESCRIPTION = "This library is for testing HTTP clients without contacting the real \
HTTP server. In other words, it is a fake HTTP server which is \
accessible via localhost can be started with the pre-defined expected \
HTTP requests and their responses."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python310-pytest-httpserver-1.0.8-1.1.noarch.rpm"
RPM_HASH = "0bb72631ee5236ceaf26e48c95987da5d9d783dfcc27aec974a7dfcaeb3fb8d6797a1d8435dcae45a578ae9940925d52fe630ff44b9283c4513ded5e6cde2099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-httpserver python3.10dist(pytest-httpserver) python310-pytest-httpserver python3dist(pytest-httpserver)"
RDEPENDS:${PN} += "python(abi) python310-Werkzeug python310-pytest"

inherit rpm
