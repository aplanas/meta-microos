SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++abi1-14.0.6-8.1.aarch64.rpm"
RPM_HASH = "06ea8c69232a5b5418a95e3c9d646caf5a8e7c21787fbecd13eb111060a24ef56d0e300655ae7c796e058bacb32ddc832450af602ca402082fa81de1a2818caf"

RPROVIDES:${PN} += "libc++abi.so.1()(64bit) libc++abi1 llvm14-libc++abi1 llvm14-libc++abi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm
