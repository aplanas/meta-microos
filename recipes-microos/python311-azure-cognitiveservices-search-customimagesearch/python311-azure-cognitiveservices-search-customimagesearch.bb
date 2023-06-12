SUMMARY = "Microsoft Azure Cognitive Services Custom Image Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-azure-cognitiveservices-search-customimagesearch-0.2.0-2.15.noarch.rpm"
RPM_HASH = "a4aeb6b96382e847a15bfe913226de76469db070dbc3d4a1a55b7b039584aca348d91f9d64508005c25e33089b2b075e066177e76258dfc38ba4ce8b1b690f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-search-customimagesearch) \
python311-azure-cognitiveservices-search-customimagesearch \
python3dist(azure-cognitiveservices-search-customimagesearch)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-msrest"

inherit rpm
