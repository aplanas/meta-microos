SUMMARY = "Multi-core gzip version"
DESCRIPTION = "A parallel implementation of gzip for modern multi-processor, multi-core machines"
LICENSE = "Zlib"

PV = "2.7"

RPM_NAME = "pigz-2.7-1.7.aarch64.rpm"
RPM_HASH = "a81dbaaf45ec4f08986698890a4c80a7871146897df7aa165a01aaab2523b30b79f353a11a5b673a4e88561cb25002941361d22091165a07bd1e69b79d468c1d"

RPROVIDES:${PN} += "pigz pigz(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libz.so.1(ZLIB_1.2.0.8)(64bit) libz.so.1(ZLIB_1.2.5.1)(64bit)"

inherit rpm
