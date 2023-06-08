SUMMARY = "Microsoft Azure Cognitive Services Computer Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Computer Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-azure-cognitiveservices-vision-computervision-0.9.0-1.8.noarch.rpm"
RPM_HASH = "563b14f1b719b6e3f1a7020ca60d2d041bb2ab0058c1114e297caed573d74a71ce45029b96adc76de8a8ee13243b2535a5ae190984f89d9efd1bee5f761fe025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-vision-computervision python3.10dist(azure-cognitiveservices-vision-computervision) python310-azure-cognitiveservices-vision-computervision python3dist(azure-cognitiveservices-vision-computervision)"
RDEPENDS:${PN} += "python(abi) python310-azure-cognitiveservices-nspkg python310-azure-cognitiveservices-vision-nspkg python310-azure-common python310-azure-nspkg python310-msrest"

inherit rpm
