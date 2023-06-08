SUMMARY = "Development headers for Boost.Atomic"
DESCRIPTION = "Development support for Boost.Atomic, a library that provides atomic \
data types and operations on these data types, as well as memory \
ordering constraints required for coordinating multiple threads through \
atomic variables."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_atomic1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "eda92618b4b92566a2ab8d87ccaf1b7b31ed1a91b3778e93d146ca8ff268f5510e1bd0ed3d57069ecef2d7567c3985ad4e8480917b2d9eca26fd9fb5bedee22c"

RPROVIDES:${PN} += "libboost_atomic-devel-impl libboost_atomic1_82_0-devel libboost_atomic1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_atomic1_82_0 libboost_headers1_82_0-devel libstdc++-devel"

inherit rpm
