SUMMARY = "Boost.Context runtime library"
DESCRIPTION = "Runtime support for Boost.Context, a library that providing cooperative \
multitasking support."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_context1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "6e1702d27e77ca335473cc0ea054bb00849f4fc20eb53e307e610da017c772f885a0573e245daa9d9bd01afca4910b849239a64a09f6717f8897536879077174"

RPROVIDES:${PN} += "libboost_context.so.1.82.0()(64bit) libboost_context1_82_0 libboost_context1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
