SUMMARY = "Microsoft Azure Custom Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Custom Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-azure-cognitiveservices-vision-customvision-3.1.0-2.11.noarch.rpm"
RPM_HASH = "5186e2e7c1403a505bbf698877952700e11f53ada81f7d9db85edc355661cd4138932a312e74249a41ecdb42a6903e0807860a26106333a0425926fcfe8f273f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-customvision \
python3.10dist(azure-cognitiveservices-vision-customvision) \
python310-azure-cognitiveservices-vision-customvision \
python3dist(azure-cognitiveservices-vision-customvision)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-nspkg \
python310-azure-cognitiveservices-vision-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
