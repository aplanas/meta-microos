SUMMARY = "Microsoft Azure Service Bus Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Bus Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.2.0"

RPM_NAME = "python311-azure-mgmt-servicebus-8.2.0-1.3.noarch.rpm"
RPM_HASH = "8603f330cbc746d064b0eeece20aa81243af2b59b7f2250e33c420eb2195575bbc19c4b2bde3c941c21fa3d6895c037552fc6606ef1bbce976c7fc80a0304ed4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-servicebus) \
python311-azure-mgmt-servicebus \
python3dist(azure-mgmt-servicebus)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
