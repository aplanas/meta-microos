SUMMARY = "Radio Access Network Application Part library"
DESCRIPTION = "Osmocom code for the Radio Access Network Application Part of the Iu-h \
interface."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmo-ranap5-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "65d53aefd6d09ec6732d5457ffcccd8338ffc27daa5eba17662985107645b4a657f115cd6c666be5b37e544d72386dcb3bf925027dfcd532bf22019bf3e23fc0"

RPROVIDES:${PN} += "libosmo-ranap.so.5()(64bit) libosmo-ranap5 libosmo-ranap5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasn1c.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmo-sigtran.so.7()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
