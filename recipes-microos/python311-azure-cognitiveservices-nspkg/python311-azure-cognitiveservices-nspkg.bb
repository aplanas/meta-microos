SUMMARY = "Microsoft Azure Cognitive Services namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-azure-cognitiveservices-nspkg-3.0.1-4.3.noarch.rpm"
RPM_HASH = "a9c2f416ed65cf84f52af4da3b6f362fabb96cec74c643823922363806f12f2e730e7f298f5c0bba097d3abf062ca88dd741330cfb786798cd5648c2ae27b2ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-nspkg) \
python311-azure-cognitiveservices-nspkg \
python3dist(azure-cognitiveservices-nspkg)"
RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
