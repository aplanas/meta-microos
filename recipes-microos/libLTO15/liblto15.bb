SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "libLTO15-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "35c3673ff4be932806c857d8a8814efad020c2f51e2eac61eda4926bd2a4f617a498f285cec16f0a9fb05369b9d99414f52adfdbd83b1ada39576ee66360d86b"

RPROVIDES:${PN} += "libLTO.so.15()(64bit) \
libLTO.so.15(LLVM_15)(64bit) \
libLTO15 \
libLTO15(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
