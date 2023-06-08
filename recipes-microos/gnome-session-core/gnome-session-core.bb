SUMMARY = "Minimal version of the GNOME Session Manager"
DESCRIPTION = "This package contains a minimal version of gnome-session, that can be \
used for specific cases. The gnome-session package is needed for a fully \
functional GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-session-core-44.0-1.1.aarch64.rpm"
RPM_HASH = "1acb1c95509944b7a2c75e3ae84852d5bebfa006a0b997317e3b89bf79ae9e39a07c0dc75641c96e0dc7a99e9b9a2b631e4c8d6b17ddb8f28165c1efd0bf5bbd"

RPROVIDES:${PN} += "gnome-session-core gnome-session-core(aarch-64)"
RDEPENDS:${PN} += "/bin/sh dbus-1-x11 gsettings-desktop-schemas hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGL.so.1()(64bit) libGLESv2.so.2()(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libXcomposite.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libepoxy.so.0()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnome-desktop-3.so.20()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
