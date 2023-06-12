SUMMARY = "Microsoft Azure NewsSearch Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services News Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-search-newssearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "82e77d6c48339d77c50e25d64d807a3195197307218f4120fc080e96ad0528f8f9c091d7fb918d67839c20fdf724b11785412c60af368effe74333affe167885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-newssearch \
python3.10dist(azure-cognitiveservices-search-newssearch) \
python310-azure-cognitiveservices-search-newssearch \
python3dist(azure-cognitiveservices-search-newssearch)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
