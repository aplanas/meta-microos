SUMMARY = "Common code to collect metrics data from other Oslo libraries"
DESCRIPTION = "This Oslo metrics API supports collecting metrics data from other \
Oslo libraries and exposing the metrics data to monitoring system. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python3-oslo.metrics-0.6.0-1.2.noarch.rpm"
RPM_HASH = "43402521fb952bb52700606cfa637a63a0c7c2ec2880087961d318ebc6c20c1fc90ebd949a8d4c8cb19de733346f0a6627cee690fae5734df189821d2fdc8c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.metrics \
python3.10dist(oslo.metrics) \
python3dist(oslo.metrics)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-oslo.config \
python3-oslo.log \
python3-oslo.utils \
python3-pbr \
python3-prometheus-client"

inherit rpm
