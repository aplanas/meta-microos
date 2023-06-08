SUMMARY = "Microsoft Azure Machine Learning Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-machinelearningservices-1.0.0-1.10.noarch.rpm"
RPM_HASH = "79761edf864fe189b7d69ffc83d6a0a1a36d271c4e9b033c6cbff49edf924fa2f9966daefa600b1111cf5d7d3d56aa38a7ceda22d3300204848f038b287c7808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-machinelearningservices) python311-azure-mgmt-machinelearningservices python3dist(azure-mgmt-machinelearningservices)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
