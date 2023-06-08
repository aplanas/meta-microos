SUMMARY = "X TrueType font cache extension client library"
DESCRIPTION = "FontCache is an extension that is used by X TrueType to cache \
information about fonts."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "libXfontcache1-1.0.5-13.1.aarch64.rpm"
RPM_HASH = "cf4ebef67de4b351eb00acf3a9b4054f45a8411615a41db712566359710d01b975e372a0fcabd858e1ad696d6e1391bcd96b8c58ab8c6df3c0b4e1c96b03763d"

RPROVIDES:${PN} += "libXfontcache.so.1()(64bit) libXfontcache1 libXfontcache1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
