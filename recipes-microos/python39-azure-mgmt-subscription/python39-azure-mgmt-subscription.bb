SUMMARY = "Microsoft Azure Subscription Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Subscription Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "python39-azure-mgmt-subscription-3.1.1-1.3.noarch.rpm"
RPM_HASH = "25a8de13cc55255bb754d7b7cc7a35e17962089978ce6c74ebc3525b0d0079b17ad288145b28604158e0b64467f6fc01e87cd0c0e3099877efc44ede4bcd914f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-subscription) python39-azure-mgmt-subscription python3dist(azure-mgmt-subscription)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
