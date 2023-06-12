SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++abi-devel-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "1dc3a1d43412927119f45b935d776770e79e145e586576b744c0ed9c851ab70c60397bc22c4004724840d7ff8be24846e0bb4253155a1a88d2392fd62b22e59c"

RPROVIDES:${PN} += "libc++abi.so llvm14-libc++abi-devel llvm14-libc++abi-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc++abi1"

inherit rpm
