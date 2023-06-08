SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++abi1-13.0.1-8.1.aarch64.rpm"
RPM_HASH = "737b06507b1e1446dcb2c71ddce156faa8cfca4d7ac5a0f1f77bde86e56150357e9cd52b755858ec40bbc41689f98aa9eb40c4535044515945a4510169054c75"

RPROVIDES:${PN} += "libc++abi.so.1()(64bit) libc++abi1 llvm13-libc++abi1 llvm13-libc++abi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm
