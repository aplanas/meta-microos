SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0b5"

RPM_NAME = "python310-azure-ai-anomalydetector-3.0.0b5-1.3.noarch.rpm"
RPM_HASH = "8d5532a611a85ea06f8fdce621371e9f0f46643b72ecc1b8d27ac31f58e9e9d75c36984a9c4173a74b784ea0f5dc18edebf6e2970b81de381dda749ea37802e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-anomalydetector \
python3.10dist(azure-ai-anomalydetector) \
python310-azure-ai-anomalydetector \
python3dist(azure-ai-anomalydetector)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-ai-nspkg \
python310-azure-common \
python310-azure-core \
python310-msrest"

inherit rpm
