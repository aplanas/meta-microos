SUMMARY = "Promises/A+ implementation for Python"
DESCRIPTION = "This is an implementation of Promises in Python"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-promise-2.3.0-3.3.noarch.rpm"
RPM_HASH = "d2667f39baf168591eace455b79bcd37b5bb22f89022ea415887ed3fb342b5e05cfc0ecae5dc8706eda427a3294e828a1a3ec5bbb48fed5d60306188921d939a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-promise \
python3.10dist(promise) \
python310-promise \
python3dist(promise)"
RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
