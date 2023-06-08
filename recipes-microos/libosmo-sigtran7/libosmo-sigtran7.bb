SUMMARY = "Osmocom SIGTRAN library"
DESCRIPTION = "Osmocom implementation of (parts of) SIGTRAN."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libosmo-sigtran7-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "e69d997973d7eea1669ade3456fb6b31d7ded91cac2663eafde34bbc3a6e308f91f2a3565458495e7b09f2dbbe71a17a2c598d8c2a61bc5f5679a7efc1fc9bf4"

RPROVIDES:${PN} += "libosmo-sigtran.so.7()(64bit) libosmo-sigtran7 libosmo-sigtran7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmonetif.so.8()(64bit) libosmovty.so.9()(64bit) libsctp.so.1()(64bit) libsctp.so.1(VERS_1)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
