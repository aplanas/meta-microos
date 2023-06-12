SUMMARY = "Development files for libgdiplus"
DESCRIPTION = "This library is part of the Mono project. It is required when \
using System.Drawing."
LICENSE = "(LGPL-2.1-or-later | MPL-1.1) & MIT"

PV = "6.0.5"

RPM_NAME = "libgdiplus-devel-6.0.5-1.11.aarch64.rpm"
RPM_HASH = "9adb3f0f31e85d345c5d3606d9c159dc8455d05286173038ca23098b42afdc056e869209ee374fd127391b65435650ec49dbf0819d8f05ed3239c9187baf2e64"

RPROVIDES:${PN} += "libgdiplus-devel \
libgdiplus-devel(aarch-64) \
pkgconfig(libgdiplus)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdiplus0 \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gthread-2.0)"

inherit rpm
