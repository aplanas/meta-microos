SUMMARY = "Development files for libelf"
DESCRIPTION = "This package contains the headers and libraries needed to build \
applications that require libelf."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libelf-devel-0.189-2.3.aarch64.rpm"
RPM_HASH = "fa2a9cc676886388813645053a0ed559e7816a8a32d75cc678732e065c477346dc0b3912fa7e4886c0c9cda78f29df60cb46bc03df8cd52c950b71156e4a573e"

RPROVIDES:${PN} += "libelf-devel libelf-devel(aarch-64) pkgconfig(libelf)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libelf1 pkgconfig(libzstd) pkgconfig(zlib)"

inherit rpm
