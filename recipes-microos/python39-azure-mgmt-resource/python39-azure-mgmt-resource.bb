SUMMARY = "Microsoft Azure Resource Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "23.0.0"

RPM_NAME = "python39-azure-mgmt-resource-23.0.0-1.2.noarch.rpm"
RPM_HASH = "e37980d4dc15bb0ce0816e37b82304a210b81fbe6cea409b858078a3b9dd10ed279e504a666dd596a54c002dc38c4357b761dad870cffb81e3fe1a7ef2586d52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-resource) python39-azure-mgmt-resource python3dist(azure-mgmt-resource)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
