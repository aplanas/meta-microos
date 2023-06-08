SUMMARY = "Xfce Session Manager"
DESCRIPTION = "xfce4-session is the session manager for the Xfce desktop environment."
LICENSE = "GPL-2.0-only"

PV = "4.18.2"

RPM_NAME = "xfce4-session-4.18.2-1.1.aarch64.rpm"
RPM_HASH = "6726770df45ed3dc1c4eef9e24792e1f21cb864aa011391765b43c6fd57adf8078c3bedbb3a93d768c27c91e31ebd114696236da40cac36e4057d670284a6282"

RPROVIDES:${PN} += "application() application(xfce-session-settings.desktop) application(xfce4-session-logout.desktop) config(xfce4-session) xfce4-session xfce4-session(aarch-64)"
RDEPENDS:${PN} += "/bin/sh iceauth ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libpolkit-gobject-1.so.0()(64bit) libwnck-3.so.0()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) libxfconf-0.so.3()(64bit) systemd update-alternatives xfce4-session-branding xfce4-settings xfconf"

inherit rpm
