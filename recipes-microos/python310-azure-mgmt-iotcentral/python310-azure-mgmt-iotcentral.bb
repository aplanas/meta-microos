SUMMARY = "Microsoft Azure IoTCentral Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTCentral Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0b2"

RPM_NAME = "python310-azure-mgmt-iotcentral-10.0.0b2-1.3.noarch.rpm"
RPM_HASH = "dfa9e2e5dee0803d439395584bc86490f7eac3468882a0fdb1b957ab83f9e3192dbf4e98d429a7d1a9a04ca59366adebf019eea6aad31e94589d9ba72268752c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-iotcentral python3.10dist(azure-mgmt-iotcentral) python310-azure-mgmt-iotcentral python3dist(azure-mgmt-iotcentral)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-msrest"

inherit rpm
