SUMMARY = "Mock time date for Python"
DESCRIPTION = "FreezeGun is a library that allows your python tests to travel through \
time by mocking the datetime module."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python311-freezegun-1.2.2-2.1.noarch.rpm"
RPM_HASH = "d3cfaff2692f7aa043e72f0dfcae4fe3dc242eeb22c36c1d61eebc6631d3275137f254b9f0d9e68b235da58973d08aa50e6d451473d872fb2433a8f9324beb1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(freezegun) python311-freezegun python3dist(freezegun)"
RDEPENDS:${PN} += "python(abi) python311 python311-python-dateutil"

inherit rpm
