SUMMARY = "Microsoft Azure Batch Client Library"
DESCRIPTION = "This is the Microsoft Azure Batch Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "13.0.0"

RPM_NAME = "python311-azure-batch-13.0.0-1.3.noarch.rpm"
RPM_HASH = "4771c0f5033d90bf92e5274ae6a9a692ba94e01179ec2f26e1c7f4f61741cc45284bedf0adf153c6b4a0f3c9bac315aaad1a8e104414bd72937adc01558fb80e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-batch) python311-azure-batch python3dist(azure-batch)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-nspkg python311-msrestazure"

inherit rpm
