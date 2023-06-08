SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++-devel-14.0.6-8.1.aarch64.rpm"
RPM_HASH = "dd38b2a3224d2d4d35fef698f9851cf2b481b6919809ef5b97cb302c7ae5e314ea427f6319a45419d97465200bba7952a1291842358189c0c6a98ffd3def2dae"

RPROVIDES:${PN} += "libc++.so llvm14-libc++-devel llvm14-libc++-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc++1 libc++abi.so"

inherit rpm
