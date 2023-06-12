SUMMARY = "Microsoft Azure Media Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Media namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.media namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-media-nspkg-1.0.0-1.10.noarch.rpm"
RPM_HASH = "60403305c53708003e841f36b67fa9e1c20cab8d246e3c1f3f4cc9a97b4c7616f71f5f530bf1ff42b217dde6c994c249a295b2beff7ccb00f5f2f188fe6e20fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-media-nspkg) \
python311-azure-media-nspkg \
python3dist(azure-media-nspkg)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-nspkg"

inherit rpm
