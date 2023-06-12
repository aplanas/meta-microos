SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++abi-devel-13.0.1-9.1.aarch64.rpm"
RPM_HASH = "592839d0b4eb083173b906e8ab3b1c04ea0e9c4e44f9838bd831f8d9cf7f852ee069fc1b8f3919c30057bf70257e1add248cdd65ab53559a2124c1ae5fd5cd75"

RPROVIDES:${PN} += "libc++abi.so llvm13-libc++abi-devel llvm13-libc++abi-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc++abi1"

inherit rpm
