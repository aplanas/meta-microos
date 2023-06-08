SUMMARY = "GNOME Remote Desktop screen sharing service"
DESCRIPTION = "GNOME Remote Desktop is a remote desktop and screen sharing service for the \
GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-remote-desktop-44.1-1.1.aarch64.rpm"
RPM_HASH = "43e550fe9b75ebc4589ca8bcda4f823d5452a57e869bfa358318f679c19df9a4c06dd34df2080d0d4ae8318fa047cd8f49f3424c4f3f5e521d944fec5fe4419d"

RPROVIDES:${PN} += "gnome-remote-desktop gnome-remote-desktop(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libepoxy.so.0()(64bit) libfdk-aac.so.2()(64bit) libfreerdp-server2.so.2()(64bit) libfreerdp2.so.2()(64bit) libfuse3.so.3()(64bit) libfuse3.so.3(FUSE_3.0)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libnotify.so.4()(64bit) libpipewire-0.3.so.0()(64bit) libsecret-1.so.0()(64bit) libtss2-esys.so.0()(64bit) libtss2-mu.so.0()(64bit) libtss2-rc.so.0()(64bit) libtss2-tctildr.so.0()(64bit) libvncserver.so.1()(64bit) libwinpr2.so.2()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_1.0.0)(64bit) pipewire"

inherit rpm
