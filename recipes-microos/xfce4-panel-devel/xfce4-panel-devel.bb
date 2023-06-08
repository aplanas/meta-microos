SUMMARY = "Development Files for xfce4-panel"
DESCRIPTION = "The xfce4-panel-devel package contains development files needed to to develop \
panel plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.3"

RPM_NAME = "xfce4-panel-devel-4.18.3-1.1.aarch64.rpm"
RPM_HASH = "69d8a2fd487997fc0619335440eefd6cddd83ab9a56efd7156c93d7deb2f214602655c4b2d75d3331edcd5164caff1a57a105b38498fc929f1d43176410b4ed5"

RPROVIDES:${PN} += "pkgconfig(libxfce4panel-2.0) xfce4-panel-devel xfce4-panel-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gtk+-3.0) pkgconfig(libxfce4util-1.0) xfce4-panel"

inherit rpm
