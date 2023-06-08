SUMMARY = "LLVM LTO plugin for ld.bfd and ld.gold"
DESCRIPTION = "This package contains a plugin for link-time optimization in binutils linkers. \
 \
Despite the name, it can also be used with ld.bfd. It is required for using \
Clang with -flto=full or -flto=thin when linking with one of those linkers."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-gold-14.0.6-8.1.aarch64.rpm"
RPM_HASH = "46131815a3c08f37e93055c578a3fed8f6ba51a90e7100790b3e3bbee3da2a3a6f79f95d9bc9e4de2437bda192bfcf67f468859e0dabc4e93d1c2f10a7b114fb"

RPROVIDES:${PN} += "llvm-gold-provider llvm14-gold llvm14-gold(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.14()(64bit) libLLVM.so.14(LLVM_14)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
