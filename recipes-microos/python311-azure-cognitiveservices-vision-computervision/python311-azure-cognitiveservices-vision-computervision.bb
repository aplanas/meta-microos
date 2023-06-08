SUMMARY = "Microsoft Azure Cognitive Services Computer Vision Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Computer Vision Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-azure-cognitiveservices-vision-computervision-0.9.0-1.8.noarch.rpm"
RPM_HASH = "b6f8528ee79392609b57ba4b9e0e6ea2fb995435f530a3f582becebc1be4c4265b257cad0c096e215161d621167afb2e56f83302278f0aaca7e72df7fba31f88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-vision-computervision) python311-azure-cognitiveservices-vision-computervision python3dist(azure-cognitiveservices-vision-computervision)"
RDEPENDS:${PN} += "python(abi) python311-azure-cognitiveservices-nspkg python311-azure-cognitiveservices-vision-nspkg python311-azure-common python311-azure-nspkg python311-msrest"

inherit rpm
