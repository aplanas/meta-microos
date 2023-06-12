SUMMARY = "Microsoft Azure Cognitive Services Form Recognizer Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Form Recognizer Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python310-azure-cognitiveservices-formrecognizer-0.1.1-2.11.noarch.rpm"
RPM_HASH = "de0ba72e89be4e83aa03b670defefdd91bf1748152964af0c2506afcdbcd2109c19a6dc519f62ca3b1c886231c10da0f7d8e1d3cfe7e7bf184b1f39cc59d31d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-formrecognizer \
python3.10dist(azure-cognitiveservices-formrecognizer) \
python310-azure-cognitiveservices-formrecognizer \
python3dist(azure-cognitiveservices-formrecognizer)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
