SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "libc++1-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "3274484fa7f21508528a70c69ae8ae8bd4d91e0d8e53b1bad033bcd0741e5bfa3a373f5a8d03825f95fe1697b47fc5c3bbc3c9542264ae09b6804e20c36e82c7"

RPROVIDES:${PN} += "libc++.so.1()(64bit) libc++1 libc++1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc++abi.so.1()(64bit) libc++abi1 libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm
