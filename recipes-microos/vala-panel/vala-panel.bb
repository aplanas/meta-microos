SUMMARY = "A Gtk3 desktop panel based on Vala"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
Initially it was a fork of LXPanel but 0.2.0 is completely \
rewritten in Vala. It offers same functionality as LXPanel but: \
 * It has a slightly bigger memory usage. \
 * X11 dependency is stripped from panel core (but it is not tested \
   on another display servers, such as Wayland and Mir, right now). \
 * Some of former LXPanel plugins are separate binaries now \
   and live in another packages (volume applet for example)."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-0.5.0-1.6.aarch64.rpm"
RPM_HASH = "7f1fe608bc3a952648242c7ac1b4ffba8cc558a2ec31bce9b6ce553df7dfe31d4a74bde8bd73b08f12740cd1d50de127fd301dcc722fae5e2f8646d12491d5a2"

RPROVIDES:${PN} += "application() \
application(org.valapanel.application.desktop) \
config(vala-panel) \
libvalapanel.so.0()(64bit) \
metainfo() \
metainfo(org.valapanel.application.appdata.xml) \
vala-panel \
vala-panel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-layer-shell.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
