SUMMARY = "Header files for wxsvg"
DESCRIPTION = "Include files for developing programs based on wxsvg."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "1.5.23"

RPM_NAME = "libwxsvg-devel-1.5.23-4.3.aarch64.rpm"
RPM_HASH = "23761704853465d96876530a2f8c6eff9034d2878fb67380cb462c79cc956875d7ececcacb6ce38a60ecbbe349e091653844f9362e81423f206b4d1bf06a6d95"

RPROVIDES:${PN} += "libwxsvg-devel \
libwxsvg-devel(aarch-64) \
pkgconfig(libwxsvg)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwxsvg3 \
pkgconfig(expat) \
pkgconfig(libart-2.0) \
pkgconfig(libexif) \
pkgconfig(pango) \
wxGTK3-3_2-devel \
wxsvg"

inherit rpm
