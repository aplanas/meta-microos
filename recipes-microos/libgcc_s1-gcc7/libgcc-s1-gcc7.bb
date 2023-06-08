SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libgcc_s1-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "4a2ffeaff17cdc653b7476ffbb5e615f29c50a109ce3227bd4ec9025612a78fc8464996f2cb478974791bcac703e2634f186cac40c50d4906685ccc2ff8823d9"

RPROVIDES:${PN} += "libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_3.4)(64bit) libgcc_s.so.1(GCC_3.4.2)(64bit) libgcc_s.so.1(GCC_3.4.4)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.3.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libgcc_s.so.1(GCC_4.7.0)(64bit) libgcc_s.so.1(GCC_7.0.0)(64bit) libgcc_s.so.1(GLIBC_2.0)(64bit) libgcc_s1 libgcc_s1-gcc7 libgcc_s1-gcc7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
