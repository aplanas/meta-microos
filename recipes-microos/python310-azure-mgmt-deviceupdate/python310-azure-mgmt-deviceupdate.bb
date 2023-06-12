SUMMARY = "Microsoft Azure Deviceupdate Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Deviceupdate Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-deviceupdate-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "0f9532573a1862ba4e665f77d5ff754e5f10b67e6d6ff34ce3f94bd629d733b32c32e046b6cdbb24fd273221b5bef44df29f5ddd82343c8dd431a9b2f5164242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-deviceupdate \
python3.10dist(azure-mgmt-deviceupdate) \
python310-azure-mgmt-deviceupdate \
python3dist(azure-mgmt-deviceupdate)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
