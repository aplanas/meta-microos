SUMMARY = "Microsoft Azure Metrics Advisor Client Library for Python"
DESCRIPTION = "Metrics Advisor is a scalable real-time time series monitoring, alerting, and root cause analysis platform. \
 \
Use Metrics Advisor to: \
 \
 * Analyze multi-dimensional data from multiple data sources \
 * Identify and correlate anomalies \
 * Configure and fine-tune the anomaly detection model used on your data \
 * Diagnose anomalies and help with root cause analysis"
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-ai-metricsadvisor-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "a70132a7f0d3efd2616dd319fa644a904812fae5dbe873195a1f05036eb9ba5bd8d13a4a15b90e4e92d4f225c63605a0b049d8dd36f82ef469facd13cedab0ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-metricsadvisor python3.10dist(azure-ai-metricsadvisor) python310-azure-ai-metricsadvisor python3dist(azure-ai-metricsadvisor)"
RDEPENDS:${PN} += "python(abi) python310-azure-ai-nspkg python310-azure-core python310-msrest python310-six"

inherit rpm
