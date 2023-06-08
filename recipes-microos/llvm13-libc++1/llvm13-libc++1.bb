SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++1-13.0.1-8.1.aarch64.rpm"
RPM_HASH = "8779d8c6b5f26f1855c2db4cdd697d6431dffbe8ca36321f9ec371fa0134c88977a35431dca634cb3d1d25c849495aded3acf23d7f0390f31cd22bbbd7f36eb6"

RPROVIDES:${PN} += "libc++.so.1()(64bit) libc++1 llvm13-libc++1 llvm13-libc++1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc++abi.so.1()(64bit) libc++abi1 libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm
