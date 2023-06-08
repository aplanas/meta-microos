SUMMARY = "Development files for the FreeIPA certmap library"
DESCRIPTION = "A utility library for FreeIPA to map certs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "libsss_certmap-devel-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "28a71d251bba5ec945c1be7b4ba2e13e18f32c99208a64554dcbac13ea826eb75cd54880d2a6f50cda4f7312aa9420d82cee968d5f91ae52e814afe4b690a6dc"

RPROVIDES:${PN} += "libsss_certmap-devel libsss_certmap-devel(aarch-64) pkgconfig(sss_certmap)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsss_certmap0"

inherit rpm
