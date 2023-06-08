SUMMARY = "Manage dependencies of tests"
DESCRIPTION = "This pytest plugin manages dependencies of tests.  It allows to mark \
some tests as dependent from other tests.  These tests will then be \
skipped if any of the dependencies did fail or has been skipped."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python310-pytest-dependency-0.5.1-2.10.noarch.rpm"
RPM_HASH = "d4d7c54f5aac137ba245d18407dc998ffe780363471219626f0e973548d26760531b265015925aa7f646017ed69f58f39b6adf468723f8638fd1adee293e5da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-dependency python3.10dist(pytest-dependency) python310-pytest-dependency python3dist(pytest-dependency)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
