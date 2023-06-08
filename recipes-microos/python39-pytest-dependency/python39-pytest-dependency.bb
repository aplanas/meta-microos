SUMMARY = "Manage dependencies of tests"
DESCRIPTION = "This pytest plugin manages dependencies of tests.  It allows to mark \
some tests as dependent from other tests.  These tests will then be \
skipped if any of the dependencies did fail or has been skipped."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "python39-pytest-dependency-0.5.1-2.10.noarch.rpm"
RPM_HASH = "90acb37647cb6fd8060616c8cac7a7b27c2c905374ee7bac194eecb8c1746f13e40a8fc5c5293c7adb1c6a062e95f8b555c6eba00c511b2a6e1dfc242f80ce36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-dependency) python39-pytest-dependency python3dist(pytest-dependency)"
RDEPENDS:${PN} += "python(abi) python39-pytest"

inherit rpm
