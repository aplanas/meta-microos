SUMMARY = "Microsoft Azure Cognitive Services Entity Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Entity Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-cognitiveservices-search-entitysearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "12c11e9b8818e487a34b3b25ba51cebd37757528d1b765586aa780e55f24ab804519dd1a8813407e507ea826f260a124d154b7b21ce3d5d9e529f11c269c8bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-search-entitysearch) python39-azure-cognitiveservices-search-entitysearch python3dist(azure-cognitiveservices-search-entitysearch)"
RDEPENDS:${PN} += "python(abi) python39-azure-cognitiveservices-nspkg python39-azure-cognitiveservices-search-nspkg python39-azure-common python39-azure-nspkg python39-msrest"

inherit rpm
