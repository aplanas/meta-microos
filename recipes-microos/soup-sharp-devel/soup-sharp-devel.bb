SUMMARY = "Libsoup bindings for Mono -- Development files"
DESCRIPTION = "Libsoup is an HTTP client/server library for GNOME. It uses GObjects \
and the glib main loop, to integrate well with GNOME applications. \
 \
This package provides development files for the Mono bindings"
LICENSE = "LGPL-3.0"

PV = "2.42.2+git.20141217.4404312"

RPM_NAME = "soup-sharp-devel-2.42.2+git.20141217.4404312-2.11.aarch64.rpm"
RPM_HASH = "c40edaa9cd87ffe4478c7ba62eae004b7de42bd0184e13dc89550e8f5d4717809847e4f0a0d13a905160173ded6e8da3ca0a580b9eb7952beff625ba8aaf90b8"

RPROVIDES:${PN} += "pkgconfig(soup-sharp-2.4) soup-sharp-devel soup-sharp-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config soup-sharp"

inherit rpm
