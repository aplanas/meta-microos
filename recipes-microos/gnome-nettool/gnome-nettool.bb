SUMMARY = "GNOME Interface for Various Networking Tools"
DESCRIPTION = "GNOME Nettool is a set of front-ends to various networking command line \
tools, like ping, netstat, ifconfig, whois, traceroute, and finger."
LICENSE = "GPL-2.0-or-later"

PV = "42.0"

RPM_NAME = "gnome-nettool-42.0-2.1.aarch64.rpm"
RPM_HASH = "438a7632b772abdc0a6e2a412fa1509e1be4e7d203d092b8ff761c338d9478a7fd554d3c15e88aa63ab442a96e282506d64400dc50bd1b6ef021ab13fffbfbb8"

RPROVIDES:${PN} += "application() \
application(gnome-nettool.desktop) \
gnome-nettool \
gnome-nettool(aarch-64) \
metainfo() \
metainfo(gnome-nettool.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtop-2.0.so.11()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
