SUMMARY = "Versatile Remote Desktop Client"
DESCRIPTION = "Remmina is a remote desktop client written in GTK+, aiming to be useful for \
system administrators and travellers, who need to work with lots of remote \
computers in front of either large monitors or tiny netbooks. Remmina supports \
multiple network protocols such as RDP, VNC, NX, XDMCP and SSH via separate \
plugins in an integrated and consistant user interface."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "d6e71b57c91ec84a25c6a2894e1c23bbc924d9b02741d8ca17a5d18f8b56661690b1559987ab84d57b882550060ee7a0d227bc19ad2d0d38db7f8bfdfdcb8efe"

RPROVIDES:${PN} += "application() \
application(org.remmina.Remmina-file.desktop) \
application(org.remmina.Remmina.desktop) \
metainfo() \
metainfo(org.remmina.Remmina.appdata.xml) \
mimehandler(application/x-remmina) \
mimehandler(x-scheme-handler/rdp) \
mimehandler(x-scheme-handler/remmina) \
mimehandler(x-scheme-handler/spice) \
mimehandler(x-scheme-handler/ssh) \
mimehandler(x-scheme-handler/vnc) \
remmina \
remmina(aarch-64) \
remmina-plugins-common"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libappindicator3.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavahi-ui-gtk3.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpango-1.0.so.0()(64bit) \
libsodium.so.23()(64bit) \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit) \
libvte-2.91.so.0()(64bit)"

inherit rpm
