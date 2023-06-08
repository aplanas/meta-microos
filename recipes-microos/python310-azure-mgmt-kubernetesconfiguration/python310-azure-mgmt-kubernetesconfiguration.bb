SUMMARY = "Microsoft Azure Kubernetes Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kubernetes Configuration Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-kubernetesconfiguration-2.0.0-1.6.noarch.rpm"
RPM_HASH = "36ccb05e1a0a411d2901fd5ed101dd601e04f833a591d144478ce8da4604414cc0072a0b2ad7cc3fe76e3fc7cbab05df317787e4d9cf044a0c83bf312b175ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-kubernetesconfiguration python3.10dist(azure-mgmt-kubernetesconfiguration) python310-azure-mgmt-kubernetesconfiguration python3dist(azure-mgmt-kubernetesconfiguration)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
