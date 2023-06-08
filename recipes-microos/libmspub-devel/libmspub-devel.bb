SUMMARY = "Files for Developing with libmspub"
DESCRIPTION = "libmspub is a library for parsing the Microsoft Publisher file format structure. \
 \
This package contains the libmspub development files."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libmspub-devel-0.1.4-2.23.aarch64.rpm"
RPM_HASH = "e51dba6be460d449f8164f3b82c896fd35dd4065e2fa873441d775780ed8121dd989928f4055f626686e4a71e8e7b4a8715b75ea5d7dea7d24d020721ac15d00"

RPROVIDES:${PN} += "libmspub-devel libmspub-devel(aarch-64) pkgconfig(libmspub-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmspub-0_1-1 pkgconfig(icu-i18n) pkgconfig(librevenge-0.0) pkgconfig(zlib)"

inherit rpm
