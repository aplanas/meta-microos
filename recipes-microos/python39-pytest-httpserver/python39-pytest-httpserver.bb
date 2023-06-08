SUMMARY = "A HTTP server for pytest"
DESCRIPTION = "This library is for testing HTTP clients without contacting the real \
HTTP server. In other words, it is a fake HTTP server which is \
accessible via localhost can be started with the pre-defined expected \
HTTP requests and their responses."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python39-pytest-httpserver-1.0.6-1.1.noarch.rpm"
RPM_HASH = "fdfa1283e3540e01123b3656b06dc52191be16ce3ed87890f377498fee1dd5d2c3eda2c9907610fb320c7cb2fb2c021a4f5611202bdd10279cbc4f4656ac96cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-httpserver) python39-pytest-httpserver python3dist(pytest-httpserver)"
RDEPENDS:${PN} += "python(abi) python39-Werkzeug python39-pytest"

inherit rpm
