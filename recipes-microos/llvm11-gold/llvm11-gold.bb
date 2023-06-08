SUMMARY = "Gold linker plugin for LLVM"
DESCRIPTION = "This package contains the Gold linker plugin for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-gold-11.0.1-12.1.aarch64.rpm"
RPM_HASH = "59ab6f3e746c102f38eda7226fc93c2936b81394ac8208bb1dc2a151bb19fe0d9afe45cf7f5ac307d58e8bc581acf5e403725b87b732ee76729f24a0f1e88025"

RPROVIDES:${PN} += "lib64/LLVMgold.so(LLVM_11)(64bit) llvm-gold-provider llvm11-gold llvm11-gold(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.11()(64bit) libLLVM.so.11(LLVM_11)(64bit) libLLVM11 libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
