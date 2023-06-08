SUMMARY = "Microsoft Azure Cognitive Services Language namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Language namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.language namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python38-azure-cognitiveservices-language-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "f879a01de49d60dc6dad3ed6f6149233f400d49051a8018ad4624c81e52459e7b215433c0630f3f99bac0765b98ebf5ec651d819aabdb6696c78451d4bf03b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist(azure-cognitiveservices-language-nspkg) python38-azure-cognitiveservices-language-nspkg python3dist(azure-cognitiveservices-language-nspkg)"
RDEPENDS:${PN} += "python38-azure-cognitiveservices-nspkg python38-azure-nspkg"

inherit rpm
