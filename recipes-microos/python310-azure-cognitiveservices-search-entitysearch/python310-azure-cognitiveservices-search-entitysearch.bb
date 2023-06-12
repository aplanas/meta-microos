SUMMARY = "Microsoft Azure Cognitive Services Entity Search Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Entity Search Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-cognitiveservices-search-entitysearch-2.0.0-2.11.noarch.rpm"
RPM_HASH = "219bdabb686f6b85b47131603d13f4198fd915afbd21349e3089c529939693bf9e4655776bcf92da744f0f0d53072d9bcaeabcdb9996aa7a42400014f7075f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-search-entitysearch \
python3.10dist(azure-cognitiveservices-search-entitysearch) \
python310-azure-cognitiveservices-search-entitysearch \
python3dist(azure-cognitiveservices-search-entitysearch)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-search-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
