SUMMARY = "Lightweight X11 desktop panel based on fbpanel"
DESCRIPTION = "LXPanel is a lightweight X11 desktop panel containing: \
1. User-friendly application menu automatically generated from *.desktop files on the system \
2. Launcher bar (Small icons clicked to launch apps) \
3. Task bar supporting urgency hint (Can flash when gaim gets new incoming messages) \
4. Notification area (System tray) \
5. Digital clock \
6. Run dialog (A dialog lets you type a command and run it, can be called in external programs) \
7. Net status icon plug-in (optional, ported from gnome-netstatus-applet) \
8. Volume control plug-in (optional, written by jserv) \
9. lxpanelctl, an external controller lets you control lxpanel in other programs. \
For example, 'lxpanelctl run' will show the Run dialog in lxpanel, and 'lxpanelctl menu' \
will show the application menu. This is useful in key bindings provided by window managers."
LICENSE = "GPL-2.0-only"

PV = "0.10.1"

RPM_NAME = "lxpanel-0.10.1-1.11.aarch64.rpm"
RPM_HASH = "1c772aa134a37783dc4d6ec8b8013a75d5673f3d0d3a05d4c50ee1e35f6985aa3c5fe7d9d3f9303633f6223b3979aaf65cf7a15c62b511ddd02c42fae4ca800d"

RPROVIDES:${PN} += "config(lxpanel) \
lxpanel \
lxpanel(aarch-64) \
lxpanel-plugins"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcurl.so.4()(64bit) \
libfm-gtk.so.4()(64bit) \
libfm.so.4()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libiw.so.30()(64bit) \
libkeybinder.so.0()(64bit) \
liblxpanel.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmenu-cache.so.3()(64bit) \
libwnck-1.so.22()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
lxmenu-data \
menu-cache"

inherit rpm
