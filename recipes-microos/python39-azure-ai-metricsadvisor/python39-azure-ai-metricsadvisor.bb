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

RPM_NAME = "python39-azure-ai-metricsadvisor-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "b5b44bde81dbb1cc281436153bb0bc6d82f9df83d6277bac5a750c52a741b380a259d3e366dbc48802cbef83fb87a8e9b47bacb4a64ade90f1baafb3d17a945c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-ai-metricsadvisor) \
python39-azure-ai-metricsadvisor \
python3dist(azure-ai-metricsadvisor)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-ai-nspkg \
python39-azure-core \
python39-msrest \
python39-six"

inherit rpm
