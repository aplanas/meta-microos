SUMMARY = "Development files for the valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code. \
 \
This package contains the libvaladoc development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.8"

RPM_NAME = "libvaladoc-0_56-devel-0.56.8-1.1.aarch64.rpm"
RPM_HASH = "c07cc63fb0b3c132bc04cac06d83362791de5b148e1390101495f8fdc2a63569ca19ff443cf0d239113b8f957cc1a388697da93c4847d0b871f753118f92afde"

RPROVIDES:${PN} += "libvaladoc-0_56-devel \
libvaladoc-0_56-devel(aarch-64) \
libvaladoc-devel \
pkgconfig(valadoc-0.56)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvaladoc-0_56-0 \
pkgconfig(gmodule-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libgvc) \
pkgconfig(libvala-0.56)"

inherit rpm
