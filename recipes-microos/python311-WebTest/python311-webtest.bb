SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-WebTest-3.0.0-4.1.noarch.rpm"
RPM_HASH = "705800174c5a4f58a025a37d549b0a9974dd0ef23f4575d1c2b6c61e317875f0e601c9417c17ca52d9462f0d8332c6d0ec9467925a89553bcf6e31c7fbb4d101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(webtest) \
python311-WebTest \
python3dist(webtest)"
RDEPENDS:${PN} += "python(abi) \
python311-WebOb \
python311-beautifulsoup4 \
python311-waitress"

inherit rpm
