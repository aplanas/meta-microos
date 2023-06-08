SUMMARY = "Microsoft Azure Commerce Client Library"
DESCRIPTION = "This is the Microsoft Azure Commerce Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python311-azure-mgmt-commerce-6.0.0-1.10.noarch.rpm"
RPM_HASH = "e80bc848efadb8f1f8def2018eb0fdcc26b735e35328bfdcc2075ee2c73082631afbc53a4268490788a1df039d7daf33c20d9a8e61141e85d452cbf004aa723d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-commerce) python311-azure-mgmt-commerce python3dist(azure-mgmt-commerce)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg"

inherit rpm
