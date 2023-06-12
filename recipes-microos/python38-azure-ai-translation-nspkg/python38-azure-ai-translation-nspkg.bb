SUMMARY = "Microsoft Azure ai-translation Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-translation Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python38-azure-ai-translation-nspkg-1.0.0-1.7.noarch.rpm"
RPM_HASH = "51a6ba9f8d5badec5da568b01d03dab367dcc5b124aa0d2b6ec28196aa944ddcd42feb407d7969a79ba2ce2c072cda2f7650e65f5713eb2c89f0319541ad0740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-ai-translation-nspkg) \
python38-azure-ai-translation-nspkg \
python3dist(azure-ai-translation-nspkg)"
RDEPENDS:${PN} += "python38-azure-ai-nspkg \
python38-azure-nspkg"

inherit rpm
