SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++-devel-13.0.1-8.1.aarch64.rpm"
RPM_HASH = "42bc87783dce42bf1ba33ecfff2a66d086156646f84b1d688dd2ddf13ba03c434d3058e21f5119bde185e633d4bbe38ed2552696f412781a059001a3058bab13"

RPROVIDES:${PN} += "libc++.so llvm13-libc++-devel llvm13-libc++-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc++1 libc++abi.so"

inherit rpm
