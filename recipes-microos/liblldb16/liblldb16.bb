SUMMARY = "LLDB software debugger runtime library"
DESCRIPTION = "This subpackage contains the main LLDB component."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "liblldb16-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "d4b1b2ba2913a441c38b666fc76d9d079f85ca2b188f5c7a5230d3ff6a64b6cdf3678cf072e55579a69dcdaed9b1e54384b8c7347a40293029d30f9fe70c72cd"

RPROVIDES:${PN} += "liblldb.so.16()(64bit) liblldb.so.16(LLVM_16)(64bit) liblldb16 liblldb16(aarch-64) liblldbIntelFeatures.so.16()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libLLVM.so.16()(64bit) libLLVM.so.16(LLVM_16)(64bit) libc.so.6(GLIBC_2.34)(64bit) libclang-cpp.so.16()(64bit) libedit.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libpanel.so.6()(64bit) libpanel.so.6(NCURSESTW6_5.7.20081102)(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit)"

inherit rpm
