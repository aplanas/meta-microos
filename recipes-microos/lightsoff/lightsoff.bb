SUMMARY = "Lights Out Game for GNOME"
DESCRIPTION = "Lights Out is a board game where the goal is to switch off all tiles. \
Toggling the status of one tile, will also toggle the status of its \
adjacent tiles."
LICENSE = "GPL-2.0-or-later"

PV = "40.0.1"

RPM_NAME = "lightsoff-40.0.1-2.3.aarch64.rpm"
RPM_HASH = "1ac10c934cf0dd9e38fb5c3151446a07b909a7164518f313df45f57ee1610b8a378dd1b4d87922d55ce905ea6975e3bca5ce92ec46edd1c305205f769d9eb980"

RPROVIDES:${PN} += "application() application(org.gnome.LightsOff.desktop) lightsoff lightsoff(aarch-64) metainfo() metainfo(org.gnome.LightsOff.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
