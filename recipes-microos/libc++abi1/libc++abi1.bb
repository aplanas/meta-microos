SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "libc++abi1-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "b621e46f97587df5f951f3a14c422c2e6edae8cd1a05c744c252e1e29648b5cb150f8ff790f983c8408bdf9e77a53cffc5d21cee9e9f64fe10897744b014f80f"

RPROVIDES:${PN} += "libc++abi.so.1()(64bit) libc++abi1 libc++abi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm
