SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-azure-mgmt-recoveryservices-2.3.0-1.3.noarch.rpm"
RPM_HASH = "3a065449399192fe340fae50da43f2674106cf51278c18334d944131a4c9d2966d9bd40f7af17ac1de2e1bf9a8ab81ce2b0e1186e3c321f51d8330b39eb415a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservices python3.10dist(azure-mgmt-recoveryservices) python310-azure-mgmt-recoveryservices python3dist(azure-mgmt-recoveryservices)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
