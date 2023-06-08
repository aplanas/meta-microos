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

RPM_NAME = "python311-azure-monitor-query-1.1.1-1.3.noarch.rpm"
RPM_HASH = "f16385de81dcfa479262ea0eaabe490aee93af75cb348710e9e35c4e4d30e59f7697c7cd1cbf00c33143cd54f046950fdbc3a399a2271e480d9a1513ab903e58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-monitor-query) python311-azure-monitor-query python3dist(azure-monitor-query)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-core python311-azure-monitor-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
