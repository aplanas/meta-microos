SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.0.1+git7231"

RPM_NAME = "libgcc_s1-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "cd851dd77c47650b36ffd57949a1fc0568dc610a454b80895cc74ceb01e40300b42757335c88a4bf555cfd1a0bfe999b7882ad4664f5bf3cc4e6ad6a546c5cc5"

RPROVIDES:${PN} += "libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_11.0)(64bit) libgcc_s.so.1(GCC_13.0.0)(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_3.4)(64bit) libgcc_s.so.1(GCC_3.4.2)(64bit) libgcc_s.so.1(GCC_3.4.4)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.3.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libgcc_s.so.1(GCC_4.7.0)(64bit) libgcc_s.so.1(GCC_7.0.0)(64bit) libgcc_s.so.1(GLIBC_2.0)(64bit) libgcc_s1 libgcc_s1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.35)(64bit)"

inherit rpm
