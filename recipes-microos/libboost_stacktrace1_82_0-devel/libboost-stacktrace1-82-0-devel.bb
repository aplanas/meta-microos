SUMMARY = "Development headers for Boost.Stacktrace library"
DESCRIPTION = "This package contains development headers for Boost.Stacktrace library. \
Boost.Stacktrace is a simple C++03 library that provide information \
about call sequence in a human-readable form."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_stacktrace1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "e1c61e1ea80988b1814f65e3ad1266f6bc52cd2df9d38010d07bd2cd3c47e93fbba6ee80818ee54878929f990bea2ff70139facaa281cad260e76a257b1c7bfc"

RPROVIDES:${PN} += "libboost_stacktrace-devel-impl \
libboost_stacktrace1_82_0-devel \
libboost_stacktrace1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += "libboost_headers1_82_0-devel \
libboost_stacktrace1_82_0"

inherit rpm
