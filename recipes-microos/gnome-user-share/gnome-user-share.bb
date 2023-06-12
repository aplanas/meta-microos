SUMMARY = "GNOME user file sharing"
DESCRIPTION = "gnome-user-share is a small package that binds together various free \
software projects to bring easy to use user-level file sharing to the \
masses. \
 \
The program is meant to run in the background when the user is logged \
in, and when file sharing is enabled a webdav server is started that \
shares the $HOME/Public folder. The share is then published to all \
computers on the local network using mDNS/rendezvous, so that it shows \
up in the Network location in GNOME."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-user-share-43.0-1.3.aarch64.rpm"
RPM_HASH = "e334220e9a2b942fb4c4ce1be5c7c8846997f6f37d641d9443db7357e60d84fb3e6ea68b69e36ea966adfc05566ae834451d0aa7d14c5713120718924653893c"

RPROVIDES:${PN} += "application() \
application(gnome-user-share-webdav.desktop) \
gnome-user-share \
gnome-user-share(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit)"

inherit rpm
