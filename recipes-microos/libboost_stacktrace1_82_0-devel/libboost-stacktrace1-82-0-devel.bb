SUMMARY = "Development headers for Boost.Stacktrace library"
DESCRIPTION = "This package contains development headers for Boost.Stacktrace library. \
Boost.Stacktrace is a simple C++03 library that provide information \
about call sequence in a human-readable form."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_stacktrace1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "ca292fc5f1b888b419cd63a477cc667517d578f7cc048d0ebff955934a999802ce482f865693a65bf898e89f164e3298440ead4c9e16fb7afbf9ad0194aa5335"

RPROVIDES:${PN} += "libboost_stacktrace-devel-impl libboost_stacktrace1_82_0-devel libboost_stacktrace1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel libboost_stacktrace1_82_0"

inherit rpm
