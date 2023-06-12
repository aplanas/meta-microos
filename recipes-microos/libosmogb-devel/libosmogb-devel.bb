SUMMARY = "Development files for the Osmocom GPRS Gb interface library"
DESCRIPTION = "The libosmogb library contains a GPRS BSSGP protocol implementation. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmogb."
LICENSE = "AGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmogb-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "1df57a369d4ad5d3174dd5559f0a665902425c6d1e441d15339ab89b2585f0e81c5eb559884b8fcf7ae587ee5b909973e264d2b84482c0b42eb242373b9fdfb8"

RPROVIDES:${PN} += "libosmogb-devel libosmogb-devel(aarch-64) pkgconfig(libosmogb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocore-devel libosmogb14 libosmogsm-devel pkgconfig(libosmocore) pkgconfig(libosmovty) pkgconfig(talloc)"

inherit rpm
