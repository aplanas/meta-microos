SUMMARY = "Helper to test WSGI applications"
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test \
requests to that application, without starting up an HTTP server. \
 \
This provides convenient full-stack testing of applications written \
with any WSGI-compatible framework."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-WebTest-3.0.0-3.1.noarch.rpm"
RPM_HASH = "9db9e0ed305d3a34185c2836f63ab2c6d4ee159d4176dba02f79c102324562cbee05d4e4e1ad3c5a4187dd56261a68f6c9cb89299635261e5d929ab33dbe950d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(webtest) python311-WebTest python3dist(webtest)"
RDEPENDS:${PN} += "python(abi) python311-WebOb python311-beautifulsoup4 python311-waitress"

inherit rpm
