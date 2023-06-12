SUMMARY = "Multiprotocol Instant Messaging Client"
DESCRIPTION = "Pidgin is a messaging application which lets you log in to accounts \
on multiple chat networks simultaneously. \
 \
Pidgin is compatible with the following chat networks out of the \
box: Jabber/XMPP, AIM, ICQ, Bonjour, Gadu-Gadu, IRC, SILC, SIMPLE, \
Novell GroupWise Messenger, IBM Sametime, and Zephyr. It can \
support many more with plugins."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "pidgin-2.14.12-1.3.aarch64.rpm"
RPM_HASH = "e05322c124490f3f56f29a3a7adf9caa64661e682aa61eb5d35dbdbd28e4dd5dcc9e95ac5d98b565008fc3967c498569c240637639dce0cf7439c01ed5aa6d36"

RPROVIDES:${PN} += "application() \
application(pidgin.desktop) \
metainfo() \
metainfo(pidgin.appdata.xml) \
perl(Pidgin) \
pidgin \
pidgin(aarch-64)"
RDEPENDS:${PN} += "ca-certificates-mozilla \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXss.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libgtkspell.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpurple \
libpurple.so.0()(64bit) \
perl-base"

inherit rpm
