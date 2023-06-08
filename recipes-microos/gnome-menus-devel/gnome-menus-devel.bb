SUMMARY = "The GNOME Desktop Menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec"
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.0"

RPM_NAME = "gnome-menus-devel-3.36.0-3.3.aarch64.rpm"
RPM_HASH = "0313a85c78a183e34e4f9be94282ffc7ce276b75003cbfdeef614796621f660af0bf6dc8a9ece6f899d049717a0dc8ac2df030fbd0800be1d3840872fd4e9ba6"

RPROVIDES:${PN} += "gnome-menus-devel gnome-menus-devel(aarch-64) pkgconfig(libgnome-menu-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgnome-menu-3-0 pkgconfig(gio-unix-2.0) typelib-1_0-GMenu-3_0"

inherit rpm
