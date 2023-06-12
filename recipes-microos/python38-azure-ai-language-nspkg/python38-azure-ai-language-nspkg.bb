SUMMARY = "Microsoft Azure ai-language Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-language Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python38-azure-ai-language-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "7ad3ec462b424c0228590b4efc254980de4a3edacef36430fb07535a9e20ed0c657d349844787c5786fc9fda13a8f8396be24d41c8f4d43a90fb611570ed6c5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-ai-language-nspkg) \
python38-azure-ai-language-nspkg \
python3dist(azure-ai-language-nspkg)"
RDEPENDS:${PN} += "python38-azure-ai-nspkg \
python38-azure-nspkg"

inherit rpm
