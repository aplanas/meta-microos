SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-azure-mgmt-recoveryservices-2.3.0-1.3.noarch.rpm"
RPM_HASH = "6d075b900abe53d3977285a79373ba8f54432d60e253ebd52ff8564c4153b2481c3b94bfa1486fb7a3bd39befed9853b411854eda960e128f9385b99001e2c27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-recoveryservices) python311-azure-mgmt-recoveryservices python3dist(azure-mgmt-recoveryservices)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
