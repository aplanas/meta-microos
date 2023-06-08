SUMMARY = "Development files for the Osmocom GPRS Gb interface library"
DESCRIPTION = "The libosmogb library contains a GPRS BSSGP protocol implementation. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmogb."
LICENSE = "AGPL-3.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmogb-devel-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "b4ad040455802a498fed7e781fda7c33bc6cd41b050979eb3bc040a304cda26110a4ee85a0c8c90a5b2730bf315420d3c02adeebf08f6e0e2641054cf1104133"

RPROVIDES:${PN} += "libosmogb-devel libosmogb-devel(aarch-64) pkgconfig(libosmogb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmocore-devel libosmogb14 libosmogsm-devel pkgconfig(libosmocore) pkgconfig(libosmovty) pkgconfig(talloc)"

inherit rpm
