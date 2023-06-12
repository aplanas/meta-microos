SUMMARY = "Development files for Guile Cairo bindings"
DESCRIPTION = "Files required to build software using Guile Cairo bindings."
LICENSE = "LGPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "guile-cairo-devel-1.11.2-1.3.aarch64.rpm"
RPM_HASH = "88ce01db831d5fff0ed73ee3cb2988682b21723871f5c8a222a17ce3356b76f1cee501a770056c519d3bd84e3c1db1783192b9717d422a33475f3d235677ab09"

RPROVIDES:${PN} += "guile-cairo-devel \
guile-cairo-devel(aarch-64) \
pkgconfig(guile-cairo)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cairo-devel \
guile-cairo \
guile-devel \
pkgconfig(cairo) \
pkgconfig(guile-3.0)"

inherit rpm
