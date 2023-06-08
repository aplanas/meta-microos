SUMMARY = "Osmocom Remote SIM protocol library"
DESCRIPTION = "libosmo-rsrpo is a utility library for encoding/decoding the ASN.1 BER \
based RSPRO (Remote SIM Protocol) protocol used between the osmo-remsim \
programs."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "libosmo-rspro1-0.2.2-1.20.aarch64.rpm"
RPM_HASH = "6351b3fc8eb615ab6f514ae3c7f4220bf59007fcf651633ffb7772309c5ede5c5e64b7f2b68a3484e0640a368c43e3021502e1bca67fd39411017211283fb5ff"

RPROVIDES:${PN} += "libosmo-rspro.so.1()(64bit) libosmo-rspro1 libosmo-rspro1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
