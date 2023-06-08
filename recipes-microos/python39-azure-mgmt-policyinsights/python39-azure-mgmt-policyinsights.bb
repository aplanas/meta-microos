SUMMARY = "Microsoft Azure Policy Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Policy Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b4"

RPM_NAME = "python39-azure-mgmt-policyinsights-1.1.0b4-1.3.noarch.rpm"
RPM_HASH = "dfa106b4006318112b32d902798e34e8168f0be39fe99cf600fdf26adc72670abfd5c4cce0824cd6c7d33c976be0086e3030f87f91529c0d437caa0b68ee21db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-policyinsights) python39-azure-mgmt-policyinsights python3dist(azure-mgmt-policyinsights)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
