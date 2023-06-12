SUMMARY = "Battery Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Battery plugin allows to monitor battery levels and can execute actions on \
low and critical levels."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.5"

RPM_NAME = "xfce4-battery-plugin-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "d3aa231ff869ab006c47196fbf9f28e2fba561839aa81daef47f41c2677dcda04db32256d1f8533e2ec3d5258626c8491274e2a4ea64e8a5537468998fdee327"

RPROVIDES:${PN} += "libbattery.so()(64bit) \
xfce4-battery-plugin \
xfce4-battery-plugin(aarch-64) \
xfce4-panel-plugin-battery"
RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.27)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
xfce4-panel"

inherit rpm
