SUMMARY = "Epiphany Search Provider for GNOME Shell"
DESCRIPTION = "Epiphany is a Web browser for the GNOME Desktop. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Web (epiphany)"
LICENSE = "GPL-3.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-shell-search-provider-epiphany-44.2-1.1.aarch64.rpm"
RPM_HASH = "3aaa2cf7c093c86ea9c5e8065b869ef77d37c771a24c47f00d8354d0402d1cafc00618d436b938c25ba9bab6b7ae70a8d30f8de388bef421db9aa8c9e67c3f42"

RPROVIDES:${PN} += "gnome-shell-search-provider-epiphany gnome-shell-search-provider-epiphany(aarch-64)"
RDEPENDS:${PN} += "epiphany gnome-shell ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libephymain.so()(64bit) libephymisc.so()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
