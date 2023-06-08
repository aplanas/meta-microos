SUMMARY = "Pytest plugin for Click"
DESCRIPTION = "Py.test plugin for Click."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-pytest-click-1.1.0-1.6.noarch.rpm"
RPM_HASH = "ff186ee6cbfef71638547aac10e391c2fd4b94f661c717812a3277284e891c83cd750e30c54c61ef257526792a6c33ff5e745294b3d1a3cf24e46818c823cf4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-click) python311-pytest-click python3dist(pytest-click)"
RDEPENDS:${PN} += "python(abi) python311-click python311-pytest"

inherit rpm
