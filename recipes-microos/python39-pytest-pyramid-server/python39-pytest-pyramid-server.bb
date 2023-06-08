SUMMARY = "Pyramid server fixture for py.test"
DESCRIPTION = "Pyramid server fixture for py.test."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-pyramid-server-1.7.0-2.4.noarch.rpm"
RPM_HASH = "da17a01a528e4ea718feae4685e9ae75de2898874e48d57ce53cf787bfdfe53674938782924e682fa260d28ee49482838500a25b50422c2d07fbd6739cd6e6a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-pyramid-server) python39-pytest-pyramid-server python3dist(pytest-pyramid-server)"
RDEPENDS:${PN} += "python(abi) python39-pyramid python39-pytest-server-fixtures python39-six python39-waitress"

inherit rpm
