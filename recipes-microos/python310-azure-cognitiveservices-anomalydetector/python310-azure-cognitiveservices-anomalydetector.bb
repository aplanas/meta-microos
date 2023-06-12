SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-azure-cognitiveservices-anomalydetector-0.3.0-2.11.noarch.rpm"
RPM_HASH = "2e5f31524b3815ca7fb5a4d66f2dd7e3a9608325dce482b1d8ff504e10a5c1c4a2eb5faead32c5ff6f3544bfbb5a3d03d469ccedf25c7e0261b9334ff4a0465d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cognitiveservices-anomalydetector \
python3.10dist(azure-cognitiveservices-anomalydetector) \
python310-azure-cognitiveservices-anomalydetector \
python3dist(azure-cognitiveservices-anomalydetector)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-cognitiveservices-nspkg \
python310-azure-common \
python310-azure-nspkg \
python310-msrest"

inherit rpm
