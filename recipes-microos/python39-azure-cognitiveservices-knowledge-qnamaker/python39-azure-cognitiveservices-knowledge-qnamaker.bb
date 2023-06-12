SUMMARY = "Microsoft Azure QnA Maker Client Library"
DESCRIPTION = "This is the Microsoft Azure QnA Maker Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-azure-cognitiveservices-knowledge-qnamaker-0.3.0-2.11.noarch.rpm"
RPM_HASH = "319ae38cf1124608bb9143de447a48de353f3411eff9510f9e52c81941a43450403307b2c04a4a672543e24ba609676ceeb1d78d06ea5d11f010ce3ea8960664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-knowledge-qnamaker) \
python39-azure-cognitiveservices-knowledge-qnamaker \
python3dist(azure-cognitiveservices-knowledge-qnamaker)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-cognitiveservices-knowledge-nspkg \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest"

inherit rpm
