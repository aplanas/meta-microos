SUMMARY = "Microsoft Azure NewsSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services News Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-cognitiveservices-search-newssearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "53a69f88d6a4547da921973876289456df88d13731f3171236090f4ea351238b0faf9b0d11df1137daf34e6cdee9be9e4832ac78c8f4d9224a420771a1829e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-search-newssearch) python311-azure-cognitiveservices-search-newssearch python3dist(azure-cognitiveservices-search-newssearch)"
RDEPENDS:${PN} += "python(abi) python311-azure-cognitiveservices-nspkg python311-azure-cognitiveservices-search-nspkg python311-azure-common python311-azure-nspkg python311-msrest"

inherit rpm
