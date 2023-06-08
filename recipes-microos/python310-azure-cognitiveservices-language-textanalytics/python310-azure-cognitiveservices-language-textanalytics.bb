SUMMARY = "Microsoft Azure Cognitive Services Text Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Text Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-azure-cognitiveservices-language-textanalytics-0.2.1-1.6.noarch.rpm"
RPM_HASH = "1454851942cbeacf1b7a67f7ed36fc49e6bf2b2132657e889922d750b3c3bb15282ab4bf0df48b7a390cf2398d039247406aac2f1fbf490d4251bbc9f815fc0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-language-textanalytics python3.10dist(azure-cognitiveservices-language-textanalytics) python310-azure-cognitiveservices-language-textanalytics python3dist(azure-cognitiveservices-language-textanalytics)"
RDEPENDS:${PN} += "python(abi) python310-azure-cognitiveservices-language-nspkg python310-azure-cognitiveservices-nspkg python310-azure-common python310-azure-mgmt-core python310-azure-nspkg python310-msrest"

inherit rpm
