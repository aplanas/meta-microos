SUMMARY = "Microsoft Azure RDBMS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure RDBMS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0b7"

RPM_NAME = "python39-azure-mgmt-rdbms-10.2.0b7-1.1.noarch.rpm"
RPM_HASH = "c09e8febd1c2bbc970c38ff2d2918ccc04aa14687f16fc0b8087087e54cd88bd22d1fb5a0cef47ed695b6cf69bebe1c01617fa8a2857ab62c35215b6f5f90c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-rdbms) python39-azure-mgmt-rdbms python3dist(azure-mgmt-rdbms)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
