SUMMARY = "Microsoft Azure IoTHub Provisioning Services Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTHub Provisioning Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-azure-mgmt-iothubprovisioningservices-1.1.0-1.6.noarch.rpm"
RPM_HASH = "47a1c5a3e8c9e017dd481d6425003be8d750a965fe92cae1de69918bafdeabedd84a1d19f006f8e31827d815344eae4c9e4e023c0a64920c8c591de72537fe5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iothubprovisioningservices python3.10dist(azure-mgmt-iothubprovisioningservices) python310-azure-mgmt-iothubprovisioningservices python3dist(azure-mgmt-iothubprovisioningservices)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
