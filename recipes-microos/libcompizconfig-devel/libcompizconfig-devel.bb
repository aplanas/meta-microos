SUMMARY = "Development files for libcompizconfig"
DESCRIPTION = "CompizConfig plugin required for compizconfig-settings-manager. \
 \
This package contains development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "libcompizconfig-devel-0.8.18-2.11.aarch64.rpm"
RPM_HASH = "715d175dd9fddaf399331478147428cceddddb96aca104632574c9a17f1bdf42191d458e0600fbca3686dd658b367dd4aca2f0a01a771c8d134530a98314b507"

RPROVIDES:${PN} += "libcompizconfig-devel libcompizconfig-devel(aarch-64) pkgconfig(libcompizconfig)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcompizconfig pkgconfig pkgconfig(compiz) pkgconfig(libxml-2.0) pkgconfig(protobuf) pkgconfig(x11)"

inherit rpm
