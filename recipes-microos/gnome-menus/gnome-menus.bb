SUMMARY = "The GNOME Desktop Menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec"
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.0"

RPM_NAME = "gnome-menus-3.36.0-3.3.aarch64.rpm"
RPM_HASH = "b93639162e27385ad5feea20ba74eb6235d4058f32b8d8d66b83fffceed3d266a7341dbbbcf91937df957cc07dc06237a82a509869753cd5a0e2a99d7a098109"

RPROVIDES:${PN} += "gnome-menus gnome-menus(aarch-64)"
RDEPENDS:${PN} += "gnome-menus-branding"

inherit rpm
