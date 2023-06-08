SUMMARY = "Gold linker plugin for LLVM"
DESCRIPTION = "This package contains the Gold linker plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-gold-13.0.1-8.1.aarch64.rpm"
RPM_HASH = "032d21a86da9f828c689f1a55f8a340cdd71772f0cfdecade1f9ce032fa828160d5838c82b6c46e60e1559b7afca87acc29c39c8d70d36a45cf4eb379d5671ea"

RPROVIDES:${PN} += "llvm-gold-provider llvm13-gold llvm13-gold(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.13()(64bit) libLLVM.so.13(LLVM_13)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
