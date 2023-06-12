SUMMARY = "Microsoft Azure RDBMS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure RDBMS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0b9"

RPM_NAME = "python39-azure-mgmt-rdbms-10.2.0b9-1.1.noarch.rpm"
RPM_HASH = "520f1efe7eb125fa2870d7c5b04e6f47acfcc836653933d615014cd576f81aefacbffa48db2f6d6f3515c5fb75cadb9b7ca2d2fbbe7e0802010791f985b5d6ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-rdbms) \
python39-azure-mgmt-rdbms \
python3dist(azure-mgmt-rdbms)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
