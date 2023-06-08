SUMMARY = "Python3 bindings for Open vSwitch"
DESCRIPTION = "This package contains the Python3 bindings for Open vSwitch database."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python3-ovs-3.1.0-13.1.aarch64.rpm"
RPM_HASH = "3d46356bf5758f05b9226deba8a202bcf9843620107dd282559720a32228f7f0eebeab3069685849b4e0b006284f2bfdfbf57a43db22c9d8df4a71e8b49ae638"

RPROVIDES:${PN} += "python3-openvswitch python3-ovs python3-ovs(aarch-64) python3.10dist(ovs) python3dist(ovs)"
RDEPENDS:${PN} += "libopenvswitch-3_1-0 python(abi) python3 python3-sortedcontainers"

inherit rpm
