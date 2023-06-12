SUMMARY = "Boost.Context runtime library"
DESCRIPTION = "Runtime support for Boost.Context, a library that providing cooperative \
multitasking support."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_context1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "dd5a0cc8f12e148b3b745ed5d80878436d97053e6fb59a7dbfb31c70cecad7df967b7435b824b322bbf2b5915771ce44230810c8e12af8ff364b7281e982994f"

RPROVIDES:${PN} += "libboost_context.so.1.82.0()(64bit) libboost_context1_82_0 libboost_context1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
