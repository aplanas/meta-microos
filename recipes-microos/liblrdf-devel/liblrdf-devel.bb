SUMMARY = "Development package for the liblrdf library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
liblrdf library."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "liblrdf-devel-0.6.1-1.12.aarch64.rpm"
RPM_HASH = "05caffae73cad36f9b7e1e3172eb64524e7c066d2d89f02c1ee20c64d3cfd46db10ccad9b5d6bc17a188b49b5c73a2e10714ff5503b0cb8d74cf62edae35087c"

RPROVIDES:${PN} += "liblrdf-devel liblrdf-devel(aarch-64) pkgconfig(lrdf)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblrdf2 libraptor-devel"

inherit rpm
