SUMMARY = "Microsoft Azure Security Center Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Security Center Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python310-azure-mgmt-security-5.0.0-1.1.noarch.rpm"
RPM_HASH = "30f82b8955ce5a4f2ad9a684136242ffb6b1029f6434f4e39f62f4f814404bcf1045a4caebc8809326dadae3b92fe7bec16015073728c9a1e223ff5576d3a255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-security \
python3.10dist(azure-mgmt-security) \
python310-azure-mgmt-security \
python3dist(azure-mgmt-security)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
