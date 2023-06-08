SUMMARY = "Microsoft Azure RDBMS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure RDBMS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0b7"

RPM_NAME = "python310-azure-mgmt-rdbms-10.2.0b7-1.1.noarch.rpm"
RPM_HASH = "870a5fe5914a73d87218fab04c340de60adc2aee2b95661bd006a593c3acb7eb79fbc7da36e3936c515c47102ef15987cbac2b7dc53a058df3a963da7f612de9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-rdbms python3.10dist(azure-mgmt-rdbms) python310-azure-mgmt-rdbms python3dist(azure-mgmt-rdbms)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
