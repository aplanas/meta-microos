SUMMARY = "Microsoft Azure Cognitive Services LUIS Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services LUIS Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-azure-cognitiveservices-language-luis-0.7.0-2.11.noarch.rpm"
RPM_HASH = "6f7c3cd259f37236ab57a83fdb4adb59abe2b9cae291d8e8081e37c01b12dad1a3c1e31370e54aa91a2424632f0459e5089ccf1205ea4a223ece762da7683384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-cognitiveservices-language-luis) \
python39-azure-cognitiveservices-language-luis \
python3dist(azure-cognitiveservices-language-luis)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-cognitiveservices-language-nspkg \
python39-azure-cognitiveservices-nspkg \
python39-azure-common \
python39-azure-nspkg \
python39-msrest \
python39-msrestazure"

inherit rpm
