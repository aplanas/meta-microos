SUMMARY = "AppMenu (Global Menu) plugin for xfce4-panel"
DESCRIPTION = "This is Global Menu plugin for using with Xfce Panel."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "xfce4-panel-plugin-appmenu-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "32111d09eb9ff9dbcc04befaabccd0f9f55e75177bfa3598c24c85a19a4128338079caf2c31cbf05716518e21e24bc5bb456a1f70f01239db99148e0e5ed9ad9"

RPROVIDES:${PN} += "libappmenu-xfce.so()(64bit) xfce4-panel-plugin-appmenu xfce4-panel-plugin-appmenu(aarch-64) xfce4-vala-panel-appmenu-plugin"
RDEPENDS:${PN} += "appmenu-gtk2-module appmenu-gtk3-module appmenu-registrar bamf-daemon libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libwnck-3.so.0()(64bit) libxfce4panel-2.0.so.4()(64bit) libxfconf-0.so.3()(64bit) xfce4-panel"

inherit rpm
