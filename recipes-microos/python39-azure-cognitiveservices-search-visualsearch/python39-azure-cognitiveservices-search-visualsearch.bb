SUMMARY = "Microsoft Azure Cognitive Services Visual Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Visual Search Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-azure-cognitiveservices-search-visualsearch-0.2.0-3.11.noarch.rpm"
RPM_HASH = "d5aaba2f18075d62b270231c3e79488a83d8bebfb3ee85d7b197402cc2e796708752692890a7d6cfa93ce0402bbf8289488411436ac23918a8cf8b48853a4c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-search-visualsearch) \
python39-azure-cognitiveservices-search-visualsearch \
python3dist(azure-cognitiveservices-search-visualsearch)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
