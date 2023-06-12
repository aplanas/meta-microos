SUMMARY = "Microsoft Azure Hybridnetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hybridnetwork Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-hybridnetwork-1.0.0-1.8.noarch.rpm"
RPM_HASH = "cdda8de4e5b7c006db40e201689ce98a0d15c4e823011d86cc7d758c809cdc90de638cf03fbaf2d0680bac9583116144daa73fa8dbcc49b3f68b628b07acd258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-hybridnetwork) \
python311-azure-mgmt-hybridnetwork \
python3dist(azure-mgmt-hybridnetwork)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
