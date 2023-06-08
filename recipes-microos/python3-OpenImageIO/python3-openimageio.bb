SUMMARY = "Python Bindings for OpenImageIO"
DESCRIPTION = "This package contains python bindings for OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "2.4.8.1"

RPM_NAME = "python3-OpenImageIO-2.4.8.1-1.5.aarch64.rpm"
RPM_HASH = "72d47597258adb32a568df2fe22f13b9140158b13d10995168d22d0d215a1421c8d70a8780e3c74c02f24212f0e8254911814761e556c34314bdc1239aca5a77"

RPROVIDES:${PN} += "python3-OpenImageIO python3-OpenImageIO(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libImath-3_1.so.29()(64bit) libOpenImageIO.so.2.4()(64bit) libOpenImageIO_Util.so.2.4()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
