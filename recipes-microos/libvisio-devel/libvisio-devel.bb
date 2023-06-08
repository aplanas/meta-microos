SUMMARY = "Files for Developing with libvisio"
DESCRIPTION = "libvisio is a library for parsing the MS Visio file format structure. It is \
cross-platform, at the moment it can be build on Microsoft Windows and Linux. \
 \
This package contains the libvisio development files."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libvisio-devel-0.1.7-1.26.aarch64.rpm"
RPM_HASH = "c9f1b30d39e360736f21dfdf4c354e786b34ff42142ca451d1edfee2ae1d68b32f62ffab7e970a4531ade67963a178f5ba0a7848519d5a742d44ab73ddc2802f"

RPROVIDES:${PN} += "libvisio-devel libvisio-devel(aarch-64) pkgconfig(libvisio-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvisio-0_1-1 pkgconfig(icu-i18n) pkgconfig(librevenge-0.0) pkgconfig(libxml-2.0)"

inherit rpm
