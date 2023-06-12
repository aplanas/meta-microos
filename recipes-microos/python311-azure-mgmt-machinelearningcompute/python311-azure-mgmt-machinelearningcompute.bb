SUMMARY = "Microsoft Azure Machine Learning Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-azure-mgmt-machinelearningcompute-0.4.1-4.11.noarch.rpm"
RPM_HASH = "9b2449e002d2d1ec5bb16c12793d209bc7ba50b52d775b7689c9f7c3facf93b673561f3f3c07186c4c82f7d5846435a43b568368070c178190388176da834db2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-machinelearningcompute) \
python311-azure-mgmt-machinelearningcompute \
python3dist(azure-mgmt-machinelearningcompute)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrestazure"

inherit rpm
