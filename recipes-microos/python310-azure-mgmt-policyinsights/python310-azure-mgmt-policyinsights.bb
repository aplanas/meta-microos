SUMMARY = "Microsoft Azure Policy Insights Client Library"
DESCRIPTION = "This is the Microsoft Azure Policy Insights Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0b4"

RPM_NAME = "python310-azure-mgmt-policyinsights-1.1.0b4-1.3.noarch.rpm"
RPM_HASH = "b9e1e5e9250b859bf21b050057bb70b2d0cf257e3d8c9be9f6e9b1c2cada280740fcc0196c80961434428cfa6c3470b5a0a89e6e63bc31057d606f9fcd30db0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-policyinsights \
python3.10dist(azure-mgmt-policyinsights) \
python310-azure-mgmt-policyinsights \
python3dist(azure-mgmt-policyinsights)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
