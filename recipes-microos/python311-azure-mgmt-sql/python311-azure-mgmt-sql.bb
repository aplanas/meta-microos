SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b10"

RPM_NAME = "python311-azure-mgmt-sql-4.0.0b10-1.1.noarch.rpm"
RPM_HASH = "5339a45fda62f7240865252b3b6bb648ace77b90bb295dbbc5c42a7fe95e7ca6629bd7ace2479577ebf8137add5e00c1b0ab7634cacb91d795c19804e8205494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-sql) python311-azure-mgmt-sql python3dist(azure-mgmt-sql)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
