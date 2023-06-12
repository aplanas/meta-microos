SUMMARY = "Development files for the Osmo ISDN utility library"
DESCRIPTION = "The libosmocore library contains various utility functions, a \
collection of common code used in various ISDN related sub-projects \
inside the Osmocom family of projects. It includes an I.460 \
sub-channel multiplex and a generic LAPD core."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmoisdn-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "9747363db92efc7f8090b15db47817098a7a00a9713354ebd347fb99369164a8b0ea9739fc8de6a9ed7eaad4a157018e5d9ef8be106b6008b8a46894602fde8f"

RPROVIDES:${PN} += "libosmoisdn-devel \
libosmoisdn-devel(aarch-64) \
pkgconfig(libosmoisdn)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(libosmocore) \
pkgconfig(talloc)"

inherit rpm
