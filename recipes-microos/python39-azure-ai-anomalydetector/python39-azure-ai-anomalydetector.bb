SUMMARY = "Microsoft Azure Cognitive Services Anomaly Detector Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Cognitive Services Anomaly Detector Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.0.0b5"

RPM_NAME = "python39-azure-ai-anomalydetector-3.0.0b5-1.3.noarch.rpm"
RPM_HASH = "e332bc2aace09270faf7d3be8a6b0b40e9e31a34a133274b09eab8746db70c083931cb074730c7ad9d98f29fa217832de257133dfe6db8cb1848fc29b8593227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-ai-anomalydetector) python39-azure-ai-anomalydetector python3dist(azure-ai-anomalydetector)"
RDEPENDS:${PN} += "python(abi) python39-azure-ai-nspkg python39-azure-common python39-azure-core python39-msrest"

inherit rpm
