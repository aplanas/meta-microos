SUMMARY = "Microsoft Azure Cognitive Services Face Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Face Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-azure-cognitiveservices-vision-face-0.6.0-1.8.noarch.rpm"
RPM_HASH = "619f0906de313c0b146b468938ca0f1057fe12cabe50e8d22bf90bf053c750de17ef518b7e0567a8d49fb6a2b08922e61433fe8a4813e1f238d6258c62f87094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-face python3.10dist(azure-cognitiveservices-vision-face) python310-azure-cognitiveservices-vision-face python3dist(azure-cognitiveservices-vision-face)"
RDEPENDS:${PN} += "python(abi) python310-azure-cognitiveservices-nspkg python310-azure-cognitiveservices-vision-nspkg python310-azure-common python310-azure-nspkg python310-msrest"

inherit rpm
