SUMMARY = "Pytest plugin to treat skipped tests a test failure"
DESCRIPTION = "Pytest plugin to treat skipped tests a test failures. \
 \
This is nice if you want to ensure that your CI tests \
really run all tests and don't skip tests because of \
missing dependencies."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python311-pytest-error-for-skips-2.0.2-1.14.noarch.rpm"
RPM_HASH = "f2f916e9e93329665fb148d85bc3319bb17f47a4005612e99cc3014afbc5465d16674fd7d30f253cbfface4111f48fa23348dc721c7c4d4f3b32fd3056d301c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-error-for-skips) python311-pytest-error-for-skips python3dist(pytest-error-for-skips)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
