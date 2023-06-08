SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-WebTest-3.0.0-3.1.noarch.rpm"
RPM_HASH = "5429d2dc354567c1726d4190d2c35fb742875d54d4d54ecd68f3565242c724b76201f71e2b97abf8773e8af2ca2413079138e19a5c3b649053b6cfff53e84a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(webtest) python39-WebTest python3dist(webtest)"
RDEPENDS:${PN} += "python(abi) python39-WebOb python39-beautifulsoup4 python39-waitress"

inherit rpm
