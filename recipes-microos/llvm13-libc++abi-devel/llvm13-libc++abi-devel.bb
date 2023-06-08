SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++abi-devel-13.0.1-8.1.aarch64.rpm"
RPM_HASH = "e67c52c056683e2b670650aec0031e4dcbdb72a2671fb099c94c0a3a24414492d4aaa7dc20bdcd70ce64930a6cb27b4bb739ed6365bb4fff9acaca8ed9e0962d"

RPROVIDES:${PN} += "libc++abi.so llvm13-libc++abi-devel llvm13-libc++abi-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc++abi1"

inherit rpm
