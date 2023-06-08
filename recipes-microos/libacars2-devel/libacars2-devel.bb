SUMMARY = "Development files for libacars"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libacars."
LICENSE = "MIT"

PV = "2.1.3"

RPM_NAME = "libacars2-devel-2.1.3-1.10.aarch64.rpm"
RPM_HASH = "f0f92c2a26de8da189e5326eb931b64d2c58b821d64567ce2a34563c4389c545a3dc7d6f65cf311b4374e2af6c56d8c58a17ab2661f9e75fa297c24810fd6afd"

RPROVIDES:${PN} += "libacars2-devel libacars2-devel(aarch-64) pkgconfig(libacars-2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libacars-2-2"

inherit rpm
