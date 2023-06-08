SUMMARY = "Microsoft Azure Cognitive Services Ink Recognizer Client Library"
DESCRIPTION = "Azure Ink Recognizer SDK is an SDK for developers to work with Azure Ink Recognizer Service. \
The service recognize a collection of ink strokes and return a tree hierarchy of the recognized units, \
such as lines, words, shapes, as well as the handwriting recognition result of the words. \
 \
Features: \
 \
* Connect to Azure Ink Recognizer Service \
* Convert collections of ink strokes into HTTP requests \
* Parse HTTP response into ink recognition units"
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-cognitiveservices-inkrecognizer-1.0.0b1-2.11.noarch.rpm"
RPM_HASH = "997d15efec07408d2c7286041d76271e34a0b0da495e1f0f80f6734fe7289635660e03ee80ad7b779363f0f85299d763741d5817ba655b31c44a3ddd69c1ba74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-inkrecognizer python3.10dist(azure-cognitiveservices-inkrecognizer) python310-azure-cognitiveservices-inkrecognizer python3dist(azure-cognitiveservices-inkrecognizer)"
RDEPENDS:${PN} += "python(abi) python310-azure-cognitiveservices-nspkg python310-azure-common python310-azure-core"

inherit rpm
