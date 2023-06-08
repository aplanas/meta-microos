SUMMARY = "Binary files of asymptote"
DESCRIPTION = "Binary files of asymptote"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66003"

RPM_NAME = "texlive-asymptote-bin-2023.20230311.svn66003-89.1.aarch64.rpm"
RPM_HASH = "252c6ec942c073c85b0c310ec43fc7dace85d6cbc8e772e9179f8df5221322e010fb874aaa939e55b8b85087af88a359c6d2a181b48c6beab855da4d9462d5ed"

RPROVIDES:${PN} += "texlive-asymptote-bin texlive-asymptote-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOSMesa.so.8()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfftw3.so.3()(64bit) libgc.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libglut.so.3()(64bit) libgsl.so.27()(64bit) libgslcblas.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libreadline.so.8()(64bit) libsigsegv.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.10)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) texlive-asymptote"

inherit rpm
