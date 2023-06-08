SUMMARY = "Plugin core for use by pytest-cov, nose-cov and nose2-cov"
DESCRIPTION = "This is a lib package for use by pytest-cov, nose-cov and nose2-cov.  Unless your developing a \
coverage plugin for a test framework then you probably want one of those."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python311-cov-core-1.15.0-4.14.noarch.rpm"
RPM_HASH = "f62fded567f6899e0130d3c7bc9eba6b3515a353c4920800d72ec5120895597bef56394254262e38874a38a635d824774a881c2f7837f3e9460cfaa3253660c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cov-core) python311-cov-core python3dist(cov-core)"
RDEPENDS:${PN} += "python(abi) python311-coverage"

inherit rpm
