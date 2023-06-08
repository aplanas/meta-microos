SUMMARY = "A library for decoding various ACARS message payloads"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libacars1-1.3.1-1.16.aarch64.rpm"
RPM_HASH = "4de90ea906a6ae04fe5b7ef2cbe4072d57fcf14643633153b200c124aa773b652c019ff79bde10092613e56dbead1e007f61a42547b4029bbe366ba9375e2399"

RPROVIDES:${PN} += "libacars.so.1()(64bit) libacars.so.1(ACARS_1.0)(64bit) libacars.so.1(ACARS_1.1)(64bit) libacars.so.1(ACARS_1.2)(64bit) libacars.so.1(ACARS_1.3)(64bit) libacars1 libacars1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libz.so.1()(64bit)"

inherit rpm
