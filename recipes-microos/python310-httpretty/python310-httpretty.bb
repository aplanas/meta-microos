SUMMARY = "HTTP client mocking tool for Python"
DESCRIPTION = "This library allows mocking of HTTP protocol based \
unit tests. \
It is similar to Ruby's FakeWeb."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-httpretty-1.1.4-5.2.noarch.rpm"
RPM_HASH = "81da01f41033265c3a5cec97c51f9462732e4241615a428f6873b8e61e043a64a12b21b849fcf4e5a0e379faadf85776fbfc6a500e7efa2f56503126c7d9c6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpretty python3.10dist(httpretty) python310-httpretty python3dist(httpretty)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
