SUMMARY = "Microsoft Azure Webpubsub Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Webpubsub Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-webpubsub-1.1.0-1.2.noarch.rpm"
RPM_HASH = "959ef3e74a154c417aef546c32a56a619526bb3737ff19106bb5ce89e1f9f876bc9faa5ed341bd5ebf72d5151eca44dffa24762ccf1570253f04d3bf0e89d6e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-webpubsub) \
python311-azure-mgmt-webpubsub \
python3dist(azure-mgmt-webpubsub)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
