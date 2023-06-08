SUMMARY = "HTTP client mocking tool for Python"
DESCRIPTION = "This library allows mocking of HTTP protocol based \
unit tests. \
It is similar to Ruby's FakeWeb."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python311-httpretty-1.1.4-5.2.noarch.rpm"
RPM_HASH = "4d55166cbc234d103c8d38472229577bd55aaa6e588fa65a070339e26f9d3fa089fccd7e224429de93ee25c835d3ab6e8247e16afc39e6fe1911a950d9c6e0bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(httpretty) python311-httpretty python3dist(httpretty)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
