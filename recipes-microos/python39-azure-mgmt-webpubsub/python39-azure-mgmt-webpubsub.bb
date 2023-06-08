SUMMARY = "Microsoft Azure Webpubsub Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Webpubsub Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-webpubsub-1.1.0-1.2.noarch.rpm"
RPM_HASH = "1720089838527022de53ade175332c57a3227ea45dd8dc824acf56a70c54c2f7ccb363a5e8c85dd6f5cf877f354ac9215713b0208fdf65619e88e6c62710a495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-webpubsub) python39-azure-mgmt-webpubsub python3dist(azure-mgmt-webpubsub)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
