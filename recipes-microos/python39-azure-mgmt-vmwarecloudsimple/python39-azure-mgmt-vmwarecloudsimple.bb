SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-azure-mgmt-vmwarecloudsimple-0.2.0-2.11.noarch.rpm"
RPM_HASH = "b4f41bb6a59e5aa6d151eed2cbaa05f27fcb7cb41fc5d76fdfe80e308b35f61dc742f9e82c10b8269718ee436d73c5dc6af4deff1b3f54b7f68c952fd0b06d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-vmwarecloudsimple) python39-azure-mgmt-vmwarecloudsimple python3dist(azure-mgmt-vmwarecloudsimple)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest python39-msrestazure"

inherit rpm
