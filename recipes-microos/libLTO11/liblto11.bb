SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "libLTO11-11.0.1-13.1.aarch64.rpm"
RPM_HASH = "c2f6e933da0d9a4326f999009ce9e1e58ac3d3c80be88e170ca3f61372452962fb9d0005ab527a9ff981707145600cc16b1aa0b4118b22d057be3d9e5d5e9925"

RPROVIDES:${PN} += "libLTO.so.11()(64bit) \
libLTO.so.11(LLVM_11)(64bit) \
libLTO11 \
libLTO11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.11()(64bit) \
libLLVM.so.11(LLVM_11)(64bit) \
libLLVM11 \
libc.so.6(GLIBC_2.32)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
