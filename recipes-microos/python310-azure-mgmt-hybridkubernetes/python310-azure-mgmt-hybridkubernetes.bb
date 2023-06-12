SUMMARY = "Microsoft Azure HybridKubernetes Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure HybridKubernetes Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-hybridkubernetes-1.1.0-1.8.noarch.rpm"
RPM_HASH = "c79797480ed0c924b8636fe8c12a3fb09f60d275f9763461d356d8c24732e5dea70f8861a2e2bb4c8dccfdd6a49d665f1ef2f59d099d11f5e44e51f525792fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hybridkubernetes \
python3.10dist(azure-mgmt-hybridkubernetes) \
python310-azure-mgmt-hybridkubernetes \
python3dist(azure-mgmt-hybridkubernetes)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
