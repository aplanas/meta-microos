SUMMARY = "Development files for uhttpmock"
DESCRIPTION = "This package contains libraries, header files and documentation for \
developing applications that use uhttpmock."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "uhttpmock-devel-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "d7003c0625940d7436881156f28b3c15df0f089af55b6083cd554bdc76c8132b46682bbc37c671b07c8225d4c3a0abcbfd950a83a4ac863e9b17266d9267b163"

RPROVIDES:${PN} += "pkgconfig(libuhttpmock-1.0) \
uhttpmock-devel \
uhttpmock-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuhttpmock-1_0-1 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(libsoup-3.0) \
typelib-1_0-Uhm-1_0"

inherit rpm
