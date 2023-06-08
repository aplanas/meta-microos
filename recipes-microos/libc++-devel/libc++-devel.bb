SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "libc++-devel-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "17d1eaa14948cc71846882bfb2eeb66280199cd8b8c13c81fce3ed21dafcb784734459ac096fd73c070f11015db528b749c3b4771dea3bc4718a3175444fd70e"

RPROVIDES:${PN} += "libc++-devel libc++-devel(aarch-64) libc++.so"
RDEPENDS:${PN} += "/sbin/ldconfig libc++1 libc++abi.so"

inherit rpm
