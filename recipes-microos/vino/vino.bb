SUMMARY = "GNOME VNC Server"
DESCRIPTION = "A VNC Server for GNOME"
LICENSE = "GPL-2.0-or-later"

PV = "3.22.0"

RPM_NAME = "vino-3.22.0-9.8.aarch64.rpm"
RPM_HASH = "3607274ba2eee4d820ba79b9b8ddb8738b5f2699495437df4d9181a43c68de128696df0ee7039425b26fec9b2cbfb40178ae4a754ead8d3af2e7c4e2c7eff91c"

RPROVIDES:${PN} += "application() \
application(vino-server.desktop) \
vino \
vino(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXtst.so.6()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavahi-glib.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libnotify.so.4()(64bit) \
libsecret-1.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
