SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "libc++abi-devel-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "5640ee62e645ea72cd53577aeb88b12a9150ee35784d2f4aa09d6f74db184d4b05f66fb37ae867e7c0ccc2706f2747fea5c658b7f20602b10c01558273a91b16"

RPROVIDES:${PN} += "libc++abi-devel libc++abi-devel(aarch-64) libc++abi.so"
RDEPENDS:${PN} += "/sbin/ldconfig libc++abi1"

inherit rpm
