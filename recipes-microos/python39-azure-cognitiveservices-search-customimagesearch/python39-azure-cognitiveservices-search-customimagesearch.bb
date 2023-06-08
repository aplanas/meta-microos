SUMMARY = "Microsoft Azure Cognitive Services Custom Image Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Custom Image Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-azure-cognitiveservices-search-customimagesearch-0.2.0-2.15.noarch.rpm"
RPM_HASH = "5948a90a469d4dffb18d6c03626262cae14337206989f8895062ee989be9e09e10be0b6535f1363b03f49a9bc5bf41c65506083014f9c8622772ca599eeca2bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-search-customimagesearch) python39-azure-cognitiveservices-search-customimagesearch python3dist(azure-cognitiveservices-search-customimagesearch)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-msrest"

inherit rpm
