SUMMARY = "Development files for libglvnd"
DESCRIPTION = "Vendor-neutral dispatch layer for arbitrating OpenGL API calls between \
multiple vendors on a per-screen basis, as described by Andy Ritger's \
OpenGL ABI proposal. This package contains the required files for \
development."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "libglvnd-devel-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "3ef60159303606d9283e1e42f1d4e4540f76353c2d46c708677de0d276e10c0393982d406e2ad4a6ee00f748f37b7f8ed5dc43e1fed71a2d08ebc1dca29a0a8d"

RPROVIDES:${PN} += "libglvnd-devel libglvnd-devel(aarch-64) pkgconfig(glx) pkgconfig(libglvnd) pkgconfig(opengl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libglvnd"

inherit rpm
