SUMMARY = "Headers for Osmocom Remote SIM"
DESCRIPTION = "libosmo-rsrpo is an utility library for encoding/decoding the ASN.1 BER \
based RSPRO (Remote SIM Protocol) protocol used between the osmo-remsim \
programs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-rspro."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "libosmo-rspro-devel-0.2.2-1.20.aarch64.rpm"
RPM_HASH = "4f525c49005dba1851bb939ba3a8624944610df70aaa3238fad3d5493edeadc923a357dba5476ad9bd78656e66da07911723519068dd2dcd5cba7b1a0195d67d"

RPROVIDES:${PN} += "libosmo-rspro-devel libosmo-rspro-devel(aarch-64) pkgconfig(libosmo-rspro)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-rspro1"

inherit rpm
