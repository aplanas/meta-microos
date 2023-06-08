SUMMARY = "Microsoft Azure Azure Monitor Query Client Library for Python"
DESCRIPTION = "Azure Monitor helps you maximize the availability and performance of your applications and \
services. It delivers a comprehensive solution for collecting, analyzing, and acting on \
telemetry from your cloud and on-premises environments. \
 \
All data collected by Azure Monitor fits into one of two fundamental types, metrics and logs. \
Metrics are numerical values that describe some aspect of a system at a particular point in \
time. They are lightweight and capable of supporting near real-time scenarios. Logs contain \
different kinds of data organized into records with different sets of properties for each \
type. Telemetry such as events and traces are stored as logs in addition to performance data \
so that it can all be combined for analysis."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-azure-monitor-query-1.1.1-1.3.noarch.rpm"
RPM_HASH = "1f50bb6b447b01e6f2dc6e973a90cd8a8254702cbd24a6aa473969cf5ecc9c165dc1cf9e411d895bec352721ee68725aa9ac63e12b55a1459c6cd443f8d6d097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-monitor-query python3.10dist(azure-monitor-query) python310-azure-monitor-query python3dist(azure-monitor-query)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-core python310-azure-monitor-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
