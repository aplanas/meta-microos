SUMMARY = "A HTTP server for pytest"
DESCRIPTION = "This library is for testing HTTP clients without contacting the real \
HTTP server. In other words, it is a fake HTTP server which is \
accessible via localhost can be started with the pre-defined expected \
HTTP requests and their responses."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python310-pytest-httpserver-1.0.6-1.1.noarch.rpm"
RPM_HASH = "241764b4345256ba2014f5083c0d3c910d00be47547a1e920d07154d2dfdc16c8d55992d2805bf9292493ad4f2dc63e8a13096ef7e92bc9fb83b1e6cd1c7b792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-httpserver python3.10dist(pytest-httpserver) python310-pytest-httpserver python3dist(pytest-httpserver)"
RDEPENDS:${PN} += "python(abi) python310-Werkzeug python310-pytest"

inherit rpm
