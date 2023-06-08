SUMMARY = "Libraries and development headers for cinnamon-menus"
DESCRIPTION = "This package provides the necessary development libraries for \
writing applications that use the Cinnamon menu system."
LICENSE = "LGPL-2.1-or-later"

PV = "5.6.0"

RPM_NAME = "libcinnamon-menu-3-devel-5.6.0-1.3.aarch64.rpm"
RPM_HASH = "a8bf560c3fbeec3be2557ecc99d4296c836d106c7299c6e2bc5489f38fe53dcdb44e5fb9b2d5adef4d285f9ab2828408bac46ebfc95b26e0e2e8328bd93106ba"

RPROVIDES:${PN} += "libcinnamon-menu-3-devel libcinnamon-menu-3-devel(aarch-64) pkgconfig(libcinnamon-menu-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcinnamon-menu-3-0 pkgconfig(gio-unix-2.0) typelib-1_0-CMenu-3_0"

inherit rpm
