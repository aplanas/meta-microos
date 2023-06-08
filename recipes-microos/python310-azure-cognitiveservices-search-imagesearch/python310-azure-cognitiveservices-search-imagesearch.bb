SUMMARY = "Microsoft Azure ImageSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-search-imagesearch-2.0.0-2.15.noarch.rpm"
RPM_HASH = "d10cab2edd9cb1231a5a5504f9beaf33a4e459c283466b7af4ef41c3c23b2d2be0a8b29982e0e81432a3b297499cd556aff81d4ffc640369b1ef6e3c5e6cb3f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-imagesearch python3.10dist(azure-cognitiveservices-search-imagesearch) python310-azure-cognitiveservices-search-imagesearch python3dist(azure-cognitiveservices-search-imagesearch)"
RDEPENDS:${PN} += "python(abi) python310-azure-cognitiveservices-nspkg python310-azure-cognitiveservices-search-nspkg python310-azure-common python310-azure-nspkg python310-msrest"

inherit rpm
