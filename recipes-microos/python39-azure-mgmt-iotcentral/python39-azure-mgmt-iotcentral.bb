SUMMARY = "Microsoft Azure IoTCentral Management Client Library"
DESCRIPTION = "This is the Microsoft Azure IoTCentral Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.0.0b2"

RPM_NAME = "python39-azure-mgmt-iotcentral-10.0.0b2-1.3.noarch.rpm"
RPM_HASH = "fe97b7ecd6b27c6027bc3a233b5d5a3c9b1e9c2faec870eb3aabbf0e50f573233323219f94262f2b83873faa10406af43e09663234300b57b6da5c8fe0b27a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-iotcentral) python39-azure-mgmt-iotcentral python3dist(azure-mgmt-iotcentral)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-msrest"

inherit rpm
