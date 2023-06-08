SUMMARY = "Test files for pydicom"
DESCRIPTION = "Test files used by pydicom and other packages by the same organisation."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pydicom-data-1.0.0-1.3.noarch.rpm"
RPM_HASH = "1a06edcdf33b48dd177491a62239a2c0fa0ae912249d464ae80a7fec2493386c78512c9074454c7da89f7ac3a60c9d683a690917a53b482835142ac0985f5750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydicom-data python3.10dist(pydicom-data) python310-pydicom-data python3dist(pydicom-data)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
