SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++-devel-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "686d2469ae5366d79cd30207ea75e692e40886f1721ec763bfb2e3c03d58a7a1fbdd26364ac98b80fff3bdb52a0e07f7270ff32ae101fd64dd0e72de3515415c"

RPROVIDES:${PN} += "libc++.so llvm13-libc++-devel llvm13-libc++-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc++1 libc++abi.so"

inherit rpm
