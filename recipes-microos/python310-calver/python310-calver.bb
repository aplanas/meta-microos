SUMMARY = "Setuptools extension for CalVer package versions"
DESCRIPTION = "Setuptools extension for CalVer package versions"
LICENSE = "Apache-2.0"

PV = "2022.6.26"

RPM_NAME = "python310-calver-2022.6.26-2.1.noarch.rpm"
RPM_HASH = "283c0ec78b1a284809f7093549fd0feb4c4afbd6bf81ec046c3fb85c15670b591dfe0f6c87db198de61587f7661c802f7f810f90a940a5e48ff756f3b5973397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calver \
python3.10dist(calver) \
python310-calver \
python3dist(calver)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
