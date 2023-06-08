SUMMARY = "MS Azure Recoveryservicessiterecovery Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Recoveryservicessiterecovery Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-recoveryservicessiterecovery-1.0.0.0-2.2.noarch.rpm"
RPM_HASH = "fc7d3e0537882ce3b1816db2a8d7a559dd916b69156a42cea413b0956ba421b1011956f3692f1deed1b632c096ce99d2c95fa6b1ccb8d84eb242baf535f81fe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservicessiterecovery python3.10dist(azure-mgmt-recoveryservicessiterecovery) python310-azure-mgmt-recoveryservicessiterecovery python3dist(azure-mgmt-recoveryservicessiterecovery)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
