SUMMARY = "Microsoft Azure Cognitive Services Video Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Video Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-cognitiveservices-search-videosearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "c866f8f67bc9f205592808cd69b08d4609d5d8b43baa5aec0d819649f5dbf3b8a96f11f70eb02e914dd13753f1f9b66b642940cc8fa968c58c3f7fc3a6211e0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-search-videosearch) python311-azure-cognitiveservices-search-videosearch python3dist(azure-cognitiveservices-search-videosearch)"
RDEPENDS:${PN} += "python(abi) python311-azure-cognitiveservices-nspkg python311-azure-cognitiveservices-search-nspkg python311-azure-common python311-azure-nspkg python311-msrest"

inherit rpm
