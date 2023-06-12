SUMMARY = "Osmocom Remote SIM protocol library"
DESCRIPTION = "libosmo-rsrpo is a utility library for encoding/decoding the ASN.1 BER \
based RSPRO (Remote SIM Protocol) protocol used between the osmo-remsim \
programs."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "libosmo-rspro1-0.2.2-1.21.aarch64.rpm"
RPM_HASH = "c0b8e99a1b1e316866b62a03da2175264502b8d835c97c89c426bdc8ce36c34cd7abcd8370889307e8667fab355326b86e75a579b8fbb4fdb6a44e3007a49c4d"

RPROVIDES:${PN} += "libosmo-rspro.so.1()(64bit) \
libosmo-rspro1 \
libosmo-rspro1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libosmocore.so.20()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
