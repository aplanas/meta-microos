SUMMARY = "Microsoft Azure Cognitive Services Face Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Face Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-azure-cognitiveservices-vision-face-0.6.0-1.8.noarch.rpm"
RPM_HASH = "279b8da3e04501ef674c4ce259ceb18aeab9868cfc57d4e980b862fe31b326ff088a4963635554534ec247fff6ee838ae64778eebb4c3326e587816b2a028590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-vision-face) \
python311-azure-cognitiveservices-vision-face \
python3dist(azure-cognitiveservices-vision-face)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-cognitiveservices-nspkg \
python311-azure-cognitiveservices-vision-nspkg \
python311-azure-common \
python311-azure-nspkg \
python311-msrest"

inherit rpm
