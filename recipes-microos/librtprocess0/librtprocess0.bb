SUMMARY = "Shared library for librtprocess"
DESCRIPTION = "This is a project that aims to make some of RawTherapee's highly optimized raw \
processing routines readily available for other FOSS photo editing software. \
 \
This package holds the shared library."
LICENSE = "BSL-1.0 & GPL-3.0-or-later"

PV = "0.12.0+20211228"

RPM_NAME = "librtprocess0-0.12.0+20211228-1.6.aarch64.rpm"
RPM_HASH = "c0c400fbe779276091dd227bc6004a3cfc6017bf85c0c1b03940e98330168a7878fbcc969ab929328f631df766714251772fbafd806c358966d126ec9f912d9b"

RPROVIDES:${PN} += "librtprocess.so.0()(64bit) librtprocess0 librtprocess0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
