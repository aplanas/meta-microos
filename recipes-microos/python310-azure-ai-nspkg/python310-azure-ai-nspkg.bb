SUMMARY = "Microsoft Azure AI namespace package"
DESCRIPTION = "This is the Microsoft Azure AI namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-ai-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "c4e4c6bd889763bb6b55588627c6f6c132726e32dac734424d15ff029895b26da532d66cd004b87340f516c71ac3e5066bf1e50d312031f07d0407728d2604d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-nspkg \
python3.10dist(azure-ai-nspkg) \
python310-azure-ai-nspkg \
python3dist(azure-ai-nspkg)"
RDEPENDS:${PN} += "python310-azure-nspkg"

inherit rpm
