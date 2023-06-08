SUMMARY = "Microsoft Azure Storagemover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagemover Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-storagemover-1.0.0-1.2.noarch.rpm"
RPM_HASH = "bd303265a403dd064dc95f1f1e09c55464afd88012b315472874429ebbf19e90873d9647a2cbf03c5e1b4e1423555f7f9ffcf0216b9c00ca4134f7e887600c7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-storagemover) python311-azure-mgmt-storagemover python3dist(azure-mgmt-storagemover)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
