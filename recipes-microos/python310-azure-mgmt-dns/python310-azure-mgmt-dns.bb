SUMMARY = "Microsoft Azure DNS Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0.0"

RPM_NAME = "python310-azure-mgmt-dns-8.0.0.0-1.3.noarch.rpm"
RPM_HASH = "83c54a7ebd6f4059036f410dc1ab84ef431eb2a9d51f77cb87a0c200841553a1cae613551dab243aefcbc1ad82263005fe85dd340eea08623d6bfd25ce35aa5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dns \
python3.10dist(azure-mgmt-dns) \
python310-azure-mgmt-dns \
python3dist(azure-mgmt-dns)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
