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

RPM_NAME = "python311-azure-ai-metricsadvisor-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "cadec8259153fc3995c122e106e2867762b375f0b9030a55169344ab378d1566326f17544a1c72e1f7c9bf6d887237f26fab245a3943eb8be944f96e96047e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-ai-metricsadvisor) python311-azure-ai-metricsadvisor python3dist(azure-ai-metricsadvisor)"
RDEPENDS:${PN} += "python(abi) python311-azure-ai-nspkg python311-azure-core python311-msrest python311-six"

inherit rpm
