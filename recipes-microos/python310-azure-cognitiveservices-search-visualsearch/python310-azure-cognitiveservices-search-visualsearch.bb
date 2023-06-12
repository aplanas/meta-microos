SUMMARY = "Microsoft Azure Cognitive Services Visual Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Visual Search Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-azure-cognitiveservices-search-visualsearch-0.2.0-3.11.noarch.rpm"
RPM_HASH = "8f447cb305efcdafecb2a8ebf7ab8500aadbb6f88fd8f90e5d70631101ce1e4aff3ae8be45e317a4f0a081a21c5a0f70036d574da6abdc9725672722fa7d545b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-visualsearch \
python3.10dist(azure-cognitiveservices-search-visualsearch) \
python310-azure-cognitiveservices-search-visualsearch \
python3dist(azure-cognitiveservices-search-visualsearch)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
