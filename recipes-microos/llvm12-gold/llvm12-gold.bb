SUMMARY = "Gold linker plugin for LLVM"
DESCRIPTION = "This package contains the Gold linker plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-gold-12.0.1-11.1.aarch64.rpm"
RPM_HASH = "182a954c4bf7f27610d6f3affece317bebe19c609b3360b21fbf85c2836149cd1dc331aeab8facf309fc36d4a014a3a4c53636792e7dfa42954f9ca0b71e2f4b"

RPROVIDES:${PN} += "llvm-gold-provider llvm12-gold llvm12-gold(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.12()(64bit) libLLVM.so.12(LLVM_12)(64bit) libLLVM12 libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
