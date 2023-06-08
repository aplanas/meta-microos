SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-WebTest-3.0.0-3.1.noarch.rpm"
RPM_HASH = "61654c65863dba2f632b1a4be7e5ada7dd2274789e3c90c903eb98305014b6eef08778ed18db396d025f86986bc52a0625622aa92d4fd162130178e396da5186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WebTest python3.10dist(webtest) python310-WebTest python3dist(webtest)"
RDEPENDS:${PN} += "python(abi) python310-WebOb python310-beautifulsoup4 python310-waitress"

inherit rpm
