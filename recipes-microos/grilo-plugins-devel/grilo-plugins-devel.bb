SUMMARY = "Development files for Grilo plugins"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-plugins-devel-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "8326f6c051bb3f1ea3650bb48733fcef6b7af6e24f6e0dafb768b7e0e8496ed9e29144998fb52de046be00dc76e7deb57d549f1991b836a06de041a6e59b36f9"

RPROVIDES:${PN} += "grilo-plugins-devel grilo-plugins-devel(aarch-64) pkgconfig(grilo-plugins-0.3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config grilo-plugin-dleyna grilo-plugin-tracker grilo-plugins"

inherit rpm
