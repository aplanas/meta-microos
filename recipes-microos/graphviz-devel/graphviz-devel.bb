SUMMARY = "Graphviz development package"
DESCRIPTION = "The graphviz-devel package contains all that's necessary for developing \
programs that use the graphviz libraries including man3 pages."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-devel-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "3f043f11cabaa1fb45ee4bdb085ea316e0457355de874e3e2c3095bf688409a4d0f1aeee2c19146c261848f57046ed389598a27c57948288ee375b65d4827ebf"

RPROVIDES:${PN} += "graphviz-devel \
graphviz-devel(aarch-64) \
pkgconfig(libcdt) \
pkgconfig(libcgraph) \
pkgconfig(libgvc) \
pkgconfig(libgvpr) \
pkgconfig(liblab_gamut) \
pkgconfig(libpathplan) \
pkgconfig(libxdot)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
graphviz \
libcdt5 \
libcgraph6 \
libgvc6 \
libgvpr2 \
liblab_gamut1 \
libpathplan4 \
libxdot4"

inherit rpm
