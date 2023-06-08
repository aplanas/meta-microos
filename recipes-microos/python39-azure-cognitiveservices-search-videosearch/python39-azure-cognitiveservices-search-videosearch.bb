SUMMARY = "Microsoft Azure Cognitive Services Video Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Video Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-cognitiveservices-search-videosearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "8e931f744666e3b69b8556d11065b042915a3dbfd09e1c528504f7c70e3072aeaf6f902dd883020dd13c46dbb32c54029e031a5ec3697c5ddb61fbfd461e2ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-search-videosearch) python39-azure-cognitiveservices-search-videosearch python3dist(azure-cognitiveservices-search-videosearch)"
RDEPENDS:${PN} += "python(abi) python39-azure-cognitiveservices-nspkg python39-azure-cognitiveservices-search-nspkg python39-azure-common python39-azure-nspkg python39-msrest"

inherit rpm
