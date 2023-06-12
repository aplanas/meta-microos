SUMMARY = "Files for Developing with libwpg"
DESCRIPTION = "libwpg is a C++ library to read and parse graphics in WPG (WordPerfect \
Graphics) format. It is cross-platform, at the moment it can be build \
on Microsoft Windows and Linux. \
 \
This package contains the libwpg development files."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-devel-0.3.4-2.1.aarch64.rpm"
RPM_HASH = "20192077c1dddb981867d0f82f819bba5f700cc22bab98589f26e5ec751286bb6aadf4cb66c42f0896ac20ce6ff865b35e568279664eb75a61ec808efc6d5a22"

RPROVIDES:${PN} += "libwpg-devel \
libwpg-devel(aarch-64) \
pkgconfig(libwpg-0.3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwpg-0_3-3 \
pkgconfig(librevenge-0.0) \
pkgconfig(libwpd-0.10)"

inherit rpm
