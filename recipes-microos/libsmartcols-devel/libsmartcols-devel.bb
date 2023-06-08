SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libsmartcols-devel-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "d1286d0ba990aa84407847a557b78fc6c640f5fe5457c8d48c8277ec587939d63c84732b79e4e6b42885600591077fa8f0f21e3c5ae9c9af9a5e802cdfa96654"

RPROVIDES:${PN} += "libsmartcols-devel libsmartcols-devel(aarch-64) pkgconfig(smartcols)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsmartcols1"

inherit rpm
