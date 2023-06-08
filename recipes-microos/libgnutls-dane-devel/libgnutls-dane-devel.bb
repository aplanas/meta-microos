SUMMARY = "Development package for GnuTLS DANE component"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls-dane-devel-3.8.0-1.1.aarch64.rpm"
RPM_HASH = "ba09ae9227061ac83756256428734a32de42b66196aedea0ece760ef6ad15e4c6f9f05c7be965d01a868f42d012e5e8fdf11aead32d3e7665d0cd3e616e039fd"

RPROVIDES:${PN} += "libgnutls-dane-devel libgnutls-dane-devel(aarch-64) pkgconfig(gnutls-dane)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgnutls-dane0 pkgconfig(gnutls)"

inherit rpm
