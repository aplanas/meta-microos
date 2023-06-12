SUMMARY = "A tool to analyze #includes in C and C++ source files"
DESCRIPTION = "'Include what you use' means this: for every symbol (type, function, \
variable, or macro) that you use in foo.cc (or foo.cpp), either foo.cc \
or foo.h should include a .h file that exports the declaration of that \
symbol. The include-what-you-use program is a tool to analyze includes \
of source files to find include-what-you-use violations, and suggest \
fixes for them. \
 \
The main goal of include-what-you-use is to remove superfluous includes. \
It does this both by figuring out what includes are not actually needed \
for this file (for both .cc and .h files), and replacing includes with \
forward declarations when possible."
LICENSE = "NCSA"

PV = "0.20"

RPM_NAME = "include-what-you-use-0.20-1.1.aarch64.rpm"
RPM_HASH = "99f1242fa5c43ec6ad575619d423328977b8ec2ad240646f1fb031f952dd3a2330a87f9e4cfb112a5efcb5ec0cac074f18488be2667eb979e4968b8b6e07541c"

RPROVIDES:${PN} += "include-what-you-use \
include-what-you-use(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclang-cpp.so.16()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
