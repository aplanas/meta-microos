SUMMARY = "Microsoft Azure IoTHub Provisioning Services Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Provisioning Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-iothubprovisioningservices-1.1.0-1.6.noarch.rpm"
RPM_HASH = "c5e138b9de9d2f38c5129cac6cbc9a80dcbf524d505c25997f563c7530c5b74d8f7aa97a3f79e236d0437b7263f061013150f05a28d991dfc23199007ce1ea9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-iothubprovisioningservices) python39-azure-mgmt-iothubprovisioningservices python3dist(azure-mgmt-iothubprovisioningservices)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
