SUMMARY = "Microsoft Azure Storagepool Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagepool Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-storagepool-1.0.0-1.8.noarch.rpm"
RPM_HASH = "11993ba78be6dc59471dacd8d779f0353909d1501b95ba8058c563519f4914071af5a8c5f6a09ea73f19d9caf995db6bcd48cfdb91c8b354cfa7488c3568bc05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-storagepool) python39-azure-mgmt-storagepool python3dist(azure-mgmt-storagepool)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
