SUMMARY = "Microsoft Azure Managed Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Managed Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.0.0"

RPM_NAME = "python311-azure-mgmt-managedservices-6.0.0.0-1.8.noarch.rpm"
RPM_HASH = "bc80c0c4b0038555525db84f2c56158d3c8ef5178e1ae50c2aa3040310c765a34ffc54f8ae7bf4f19c93aa8aabce552d6e2c6cbefdad1629abc66184417b2e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-managedservices) python311-azure-mgmt-managedservices python3dist(azure-mgmt-managedservices)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
