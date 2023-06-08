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

RPM_NAME = "python39-azure-monitor-query-1.1.1-1.3.noarch.rpm"
RPM_HASH = "59bbb90d115dd2538640062fe4f367d65642415e1e5336b526301c5a7fe3a6cdf57575f5b92fef7f170c613908b48b27c1baaedbed045c6852e2b68ab5daf80b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-monitor-query) python39-azure-monitor-query python3dist(azure-monitor-query)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-core python39-azure-monitor-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
