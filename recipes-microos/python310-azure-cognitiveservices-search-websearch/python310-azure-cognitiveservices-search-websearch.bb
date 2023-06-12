SUMMARY = "Microsoft Azure Cognitive Services WebSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Web Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-search-websearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "5fa3ef6b2a1c1037142ac207b20e03945b2af50136aa6b7660863a9374522b90ac973780b623b63ed7905ffc39f16de79d0d37f3c4edae4d3fab2a073d92f1ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-websearch \
python3.10dist(azure-cognitiveservices-search-websearch) \
python310-azure-cognitiveservices-search-websearch \
python3dist(azure-cognitiveservices-search-websearch)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
