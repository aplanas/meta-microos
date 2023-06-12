SUMMARY = "Microsoft Azure Cognitive Services Custom Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-azure-cognitiveservices-search-customsearch-0.3.0-2.11.noarch.rpm"
RPM_HASH = "79845244b7d1759635ac18060a87f29f930ea9b1ece06836a54ec0f74e871129ab41bbdd24dc7846938d246a175c34cfb6a7dc81a48bdce75b5584044fa1771c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-search-customsearch) \
python39-azure-cognitiveservices-search-customsearch \
python3dist(azure-cognitiveservices-search-customsearch)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-cognitiveservices-nspkg \
python39-azure-cognitiveservices-search-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
