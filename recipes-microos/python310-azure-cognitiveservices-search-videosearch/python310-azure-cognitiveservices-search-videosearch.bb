SUMMARY = "Microsoft Azure Cognitive Services Video Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Video Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-search-videosearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "008ed7139a810ea6c9079ec24f5c2c5b910491a5307b0e2c173c5ad71f63974c89d668a3e60329a39ac217bd796f470e42e7ae32169545ef0be108f1c1d00953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-videosearch python3.10dist(azure-cognitiveservices-search-videosearch) python310-azure-cognitiveservices-search-videosearch python3dist(azure-cognitiveservices-search-videosearch)"
RDEPENDS:${PN} += "python(abi) python310-azure-cognitiveservices-nspkg python310-azure-cognitiveservices-search-nspkg python310-azure-common python310-azure-nspkg python310-msrest"

inherit rpm
