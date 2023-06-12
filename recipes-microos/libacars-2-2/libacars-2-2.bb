SUMMARY = "A library for decoding various ACARS message payloads"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads."
LICENSE = "MIT"

PV = "2.1.4"

RPM_NAME = "libacars-2-2-2.1.4-1.1.aarch64.rpm"
RPM_HASH = "315a1ef38f4f27156449249626edf58f6cd9f65146c9acc33086c9d119a18ea90064d20a3e00fd6ba83658a445222e8bbaba37bcf09d94cd7771550655edeb0e"

RPROVIDES:${PN} += "libacars-2-2 libacars-2-2(aarch-64) libacars-2.so.2()(64bit) libacars-2.so.2(ACARS_2.0)(64bit) libacars-2.so.2(ACARS_2.1)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libz.so.1()(64bit)"

inherit rpm
