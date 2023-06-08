SUMMARY = "A library for decoding various ACARS message payloads"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads."
LICENSE = "MIT"

PV = "2.1.3"

RPM_NAME = "libacars-2-2-2.1.3-1.10.aarch64.rpm"
RPM_HASH = "c5704c920dcfe78a0b4e5852f526e39fbd0a908f5acd266a7892b4a2e1a8a447f20faab6bab194b292d3e0ab6673ebaa5ca8308a2615c9181be72f4123afdf49"

RPROVIDES:${PN} += "libacars-2-2 libacars-2-2(aarch-64) libacars-2.so.2()(64bit) libacars-2.so.2(ACARS_2.0)(64bit) libacars-2.so.2(ACARS_2.1)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libz.so.1()(64bit)"

inherit rpm
