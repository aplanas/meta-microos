SUMMARY = "LLVM Execution Engine"
DESCRIPTION = "KLEE is a symbolic virtual machine built on top of the LLVM compiler \
infrastructure, and available under the UIUC open source license. For more \
information on what KLEE is and what it can do, see the OSDI 2008 paper."
LICENSE = "NCSA"

PV = "2.3+20230326"

RPM_NAME = "klee-2.3+20230326-1.1.aarch64.rpm"
RPM_HASH = "0aafac757cdcd28a0afe3643356183aaf85f94170edc26481bd4cb8483ec368171133f13be234d8e8f7301092b7b71385fea740a74fed8f269a7b4058f9e4832"

RPROVIDES:${PN} += "klee klee(aarch-64) libkleeRuntest.so.1.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.14()(64bit) libLLVM.so.14(LLVM_14)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libstp.so.2.3()(64bit) libtcmalloc.so.4()(64bit) libz.so.1()(64bit)"

inherit rpm
