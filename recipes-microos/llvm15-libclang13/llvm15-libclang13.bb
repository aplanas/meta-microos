SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-libclang13-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "cc1608ed44d988bf6caff36d9552d29338752bacadc4cc5ae65235268aceb9abc703406a42a810ffad727c19c040f49f7a7043ff95a97cddd61fabb4c5690888"

RPROVIDES:${PN} += "libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libclang13 \
llvm15-libclang13 \
llvm15-libclang13(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclang-cpp.so.15()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
