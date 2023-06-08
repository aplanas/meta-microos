SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-libc++abi-devel-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "d05f9b55f38d09cc2cc59015747dfc4e52087902d4c4dc6d895449fbdbf3b2b2fcb495dc8bef344dbfdcc0098cd22610c9408fea3d958338126874aedadfede4"

RPROVIDES:${PN} += "libc++abi.so llvm15-libc++abi-devel llvm15-libc++abi-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc++abi1"

inherit rpm
