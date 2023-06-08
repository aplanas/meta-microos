SUMMARY = "Microsoft Azure ai-language Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-language Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-ai-language-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "855d6fb94fad7d4e30fc8b146b6a14596e110d956779f86ff751899ae5eecea06f46c84685a21995fcabd995df1b6517be488a6b30ced3bdace1c2c1ff5c083e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-ai-language-nspkg) python311-azure-ai-language-nspkg python3dist(azure-ai-language-nspkg)"
RDEPENDS:${PN} += "python311-azure-ai-nspkg python311-azure-nspkg"

inherit rpm
