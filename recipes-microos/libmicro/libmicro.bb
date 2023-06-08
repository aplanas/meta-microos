SUMMARY = "LibMicro is a portable set of microbenchmarks"
DESCRIPTION = "LibMicro is a portable set of microbenchmarks that many Solaris \
engineers used during Solaris 10 development to measure the \
performance of various system and library calls."
LICENSE = "CDDL-1.0"

PV = "0.4.2+hg.20120726"

RPM_NAME = "libmicro-0.4.2+hg.20120726-3.13.aarch64.rpm"
RPM_HASH = "e43490231942dc17f80d632917b294ca1b4909309c2aabd4ec5366f02aeed2ff9e3189b859693030ebddaed8d1585f9ede9eeecee5cbdb0950bf2c830f145f91"

RPROVIDES:${PN} += "libmicro libmicro(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
