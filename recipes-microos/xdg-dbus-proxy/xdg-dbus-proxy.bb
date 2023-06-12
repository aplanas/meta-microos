SUMMARY = "Filtering proxy for D-Bus connections"
DESCRIPTION = "xdg-dbus-proxy is a filtering proxy for D-Bus connections. It was \
originally part of the flatpak project, but it has been broken out \
as a standalone module to facilitate using it in other contexts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.4"

RPM_NAME = "xdg-dbus-proxy-0.1.4-2.3.aarch64.rpm"
RPM_HASH = "6f37e4787e034594de82442b8d68ba469c1ff60bbc4ea93652f198e4db59c380752d853b4af10ae4cff0fb03e6553b93fb9a32bedf5e77976b611166bda722bf"

RPROVIDES:${PN} += "xdg-dbus-proxy \
xdg-dbus-proxy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
