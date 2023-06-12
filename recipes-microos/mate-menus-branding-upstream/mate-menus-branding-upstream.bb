SUMMARY = "Upstream menus definition for the MATE desktop menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
https://freedesktop.org/Standards/menu-spec \
 \
This package provides the upstream definitions for menus."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-menus-branding-upstream-1.26.1-1.1.noarch.rpm"
RPM_HASH = "150401b87238e3b72f953a6a3cfe9139d68f683e2eed698103084cc12eeb68a49b1db935e4b4f9353405f473f12054d1877290d24a9dd348ef9ec39474acfa0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-menus-branding-upstream) mate-menus-branding mate-menus-branding-upstream"
RDEPENDS:${PN} += "mate-menus"

inherit rpm
