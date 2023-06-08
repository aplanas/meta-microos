SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-azure-cognitiveservices-anomalydetector-0.3.0-2.11.noarch.rpm"
RPM_HASH = "e569e82ea65ce8c8e65d91eb2dde11bb84c578d146ec21a6c9bbd096edbe5c5d50f06d9821aed3d23f0c55055782c41f3e89ad6b99e0cedee64367b2f01a29cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-cognitiveservices-anomalydetector) python311-azure-cognitiveservices-anomalydetector python3dist(azure-cognitiveservices-anomalydetector)"
RDEPENDS:${PN} += "python(abi) python311-azure-cognitiveservices-nspkg python311-azure-common python311-azure-nspkg python311-msrest"

inherit rpm
