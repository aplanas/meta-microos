SUMMARY = "Microsoft Azure AI namespace package"
DESCRIPTION = "This is the Microsoft Azure AI namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python38-azure-ai-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "49896d79cb8af4e6d1b447fad7d13a28da55b0873ee31d9bc8a3db1ff784cc796f9b4d94ed3a75f4e27c4c0b09f572a3a01a974ad79ff6acf043acc913d7e9ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-ai-nspkg) \
python38-azure-ai-nspkg \
python3dist(azure-ai-nspkg)"
RDEPENDS:${PN} += "python38-azure-nspkg"

inherit rpm
