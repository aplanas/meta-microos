SUMMARY = "Web service for testing HTTP libraries"
DESCRIPTION = "httpbin is a web service for testing HTTP libraries. It has several \
endpoints that can test parts needed in a HTTP library. \
 \
Pytest-httpbin creates a pytest 'fixture' that is \
dependency-injected into your tests. It automatically starts up a HTTP server \
in a separate thread running httpbin and provides your test with the URL in the \
fixture."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-pytest-httpbin-1.0.2-3.1.noarch.rpm"
RPM_HASH = "479b8bcbdd4f819d3c01500b11d69064c9689ebb6cbda135484321ece7123af198731af4ea775cbc53ac37c70ff1e002221a142b5ac16ddbb4296c4aab793b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-httpbin \
python3.10dist(pytest-httpbin) \
python310-pytest-httpbin \
python3dist(pytest-httpbin)"
RDEPENDS:${PN} += "python(abi) \
python310-httpbin \
python310-pytest"

inherit rpm
