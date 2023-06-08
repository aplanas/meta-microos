SUMMARY = "Imlib 2 - development libraries"
DESCRIPTION = "These are the development headers and library for imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "imlib2-devel-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "8e9ac3b44af2161f079b11fe5b3aabfe19010e02c9b1ea9dfd7320621c06ab513fd9667f81dc2b080aee442b2f0246025123708ec45ccc707bc313e0d77e1ac7"

RPROVIDES:${PN} += "imlib2-devel imlib2-devel(aarch-64) pkgconfig(imlib2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libImlib2-1 xorg-x11-libX11-devel"

inherit rpm
