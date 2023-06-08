SUMMARY = "Development files for Nemo"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment. \
 \
This package provides the development files for Nemo."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.4"

RPM_NAME = "nemo-devel-5.6.4-1.2.aarch64.rpm"
RPM_HASH = "c2b759b935ce1e8114c1066cdb08e8f88a4566f9a85be3b072273ed6230ffb173e7c13fd1821120c2600c59bae7fe84fce9580aacfa85203393f82704917e05a"

RPROVIDES:${PN} += "nemo-devel nemo-devel(aarch-64) pkgconfig(libnemo-extension)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libnemo-extension1 nemo pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gtk+-3.0) typelib-1_0-Nemo-3_0"

inherit rpm
