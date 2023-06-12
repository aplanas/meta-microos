SUMMARY = "Microsoft Azure MSI Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MSI Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python311-azure-mgmt-msi-7.0.0-1.3.noarch.rpm"
RPM_HASH = "47fb3f20f1b1e4aba24a5fd70948bfe480290a740acf951ab8f661c4fef94c1ad21e860f27ef1bd85fb660bd5a87e84787d684ec3e4131672a5042a85daf363a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-msi) \
python311-azure-mgmt-msi \
python3dist(azure-mgmt-msi)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
