SUMMARY = "Microsoft Azure Cognitive Services Bing Spell Check Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Spellcheck Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-cognitiveservices-language-spellcheck-2.0.0-2.11.noarch.rpm"
RPM_HASH = "f4889f2e001f5b61a6fe6d39fe913b20c5db12ac07cc8384017d099aed738b6bbdd1c2b4bea91592ccfc223d8334a7dc9a6d6a0f223941096ac27c1d5fd7e392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-language-spellcheck) python39-azure-cognitiveservices-language-spellcheck python3dist(azure-cognitiveservices-language-spellcheck)"
RDEPENDS:${PN} += "python(abi) python39-azure-cognitiveservices-language-nspkg python39-azure-cognitiveservices-nspkg python39-azure-common python39-azure-nspkg python39-msrest"

inherit rpm
