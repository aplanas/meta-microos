SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "2.0.4"

RPM_NAME = "python311-pytest-metadata-2.0.4-1.3.noarch.rpm"
RPM_HASH = "e50cd1710a6cba1138b91cecf256e0768e9fd4882d94ba328d862154dcae922fca86ea8fa0cc8e975e9795eb4be15014f110f8d6c4dff8dbd2b71ea7a6976530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-metadata) python311-pytest-metadata python3dist(pytest-metadata)"
RDEPENDS:${PN} += "python(abi) python311-pytest"

inherit rpm
