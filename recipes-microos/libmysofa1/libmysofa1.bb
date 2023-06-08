SUMMARY = "Reader for AES SOFA HRTF files"
DESCRIPTION = "This is a C library to read AES SOFA files that contain HRTFs stored \
according to the AES69-2015 standard."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libmysofa1-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "cae37475575c7869c0871be376d2c47be900969814743aadd42a2e7abb01800bd3de2a33a6e368c5576acf088708ec2f86e43ea1117656a146da1ab6b8dfde77"

RPROVIDES:${PN} += "libmysofa.so.1()(64bit) libmysofa1 libmysofa1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libz.so.1()(64bit)"

inherit rpm
