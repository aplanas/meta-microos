SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++abi-devel-14.0.6-8.1.aarch64.rpm"
RPM_HASH = "679237bd113d31f8f56756786b2c689a042dee2c27f49d632b0d4d89735365daba5fae4cb0f2dec26037a2c0d2e9ca7604a85a637a66c7834d185d779ae872f4"

RPROVIDES:${PN} += "libc++abi.so llvm14-libc++abi-devel llvm14-libc++abi-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc++abi1"

inherit rpm
