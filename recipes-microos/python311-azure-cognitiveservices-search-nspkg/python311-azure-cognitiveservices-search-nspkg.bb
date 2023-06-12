SUMMARY = "Microsoft Azure Cognitive Services Search namespace package"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Search namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.cognitiveservices.search namespace."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-azure-cognitiveservices-search-nspkg-3.0.1-3.9.noarch.rpm"
RPM_HASH = "9819bdc11626c2821e2ca3ab093aeb47c2fade5da3e7f090f58a628d765dfae16e8f07972209a982b9e7a629401a3c7607256f77760055a550ac19f2aac71468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-search-nspkg) \
python311-azure-cognitiveservices-search-nspkg \
python3dist(azure-cognitiveservices-search-nspkg)"
RDEPENDS:${PN} += "python311-azure-cognitiveservices-nspkg \
python311-azure-nspkg"

inherit rpm
