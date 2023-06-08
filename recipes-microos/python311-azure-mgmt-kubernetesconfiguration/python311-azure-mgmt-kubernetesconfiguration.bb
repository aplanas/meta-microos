SUMMARY = "Microsoft Azure Kubernetes Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kubernetes Configuration Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-kubernetesconfiguration-2.0.0-1.6.noarch.rpm"
RPM_HASH = "4d2db87ddc8e561b1eb58ba6766ddac3677cfe3ca5f41d2c693c156e8a1a51e625a4d4a7ee53b97264ff98b36f60b024e7d0b0c9476d359e6c5d86e3b7ac0844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-kubernetesconfiguration) python311-azure-mgmt-kubernetesconfiguration python3dist(azure-mgmt-kubernetesconfiguration)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
