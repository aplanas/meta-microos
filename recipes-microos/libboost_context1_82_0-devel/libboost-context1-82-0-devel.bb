SUMMARY = "Development headers for Boost.Context"
DESCRIPTION = "Development headers and libraries for Boost.Context, a library that \
providing cooperative multitasking support."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_context1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "d9ec758fcd06f0e7ae46497ba745f7869b362cfa6cf57ecfba1ba33bfe9e82f3e9cbfc82908dc86459d63beffc3b48af455497064586c3f411201548811612dd"

RPROVIDES:${PN} += "libboost_context-devel-impl libboost_context1_82_0-devel libboost_context1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_context1_82_0 libboost_headers1_82_0-devel libstdc++-devel"

inherit rpm
