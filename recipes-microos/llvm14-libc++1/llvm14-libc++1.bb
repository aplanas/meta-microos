SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++1-14.0.6-8.1.aarch64.rpm"
RPM_HASH = "7fb718ca09674aac6fa699eb39df70b518acc3202d4776ee5cb386c74d43a113f260a7d58f1440666bd0474ee35439c39775cc006e5820f186d2f5c91633245d"

RPROVIDES:${PN} += "libc++.so.1()(64bit) libc++1 llvm14-libc++1 llvm14-libc++1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc++abi.so.1()(64bit) libc++abi1 libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm
