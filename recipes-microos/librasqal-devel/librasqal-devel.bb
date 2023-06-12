SUMMARY = "Development package for the Rasqal RDF query library"
DESCRIPTION = "This package contains the files needed to develop with the Rasqal RDF \
query language library."
LICENSE = "LGPL-2.1+ | GPL-2.0+ | Apache-2.0+"

PV = "0.9.33"

RPM_NAME = "librasqal-devel-0.9.33-1.30.aarch64.rpm"
RPM_HASH = "aff00f355e2a6e3eb454a85692c323440aeee2ed5f6cef6c14076d10f5e019c63d1e7815ff2fcb734b7c6f1441fd1d699766b87d2a4680530df960d41d6f89d7"

RPROVIDES:${PN} += "librasqal-devel \
librasqal-devel(aarch-64) \
pkgconfig(rasqal)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libraptor-devel \
librasqal3 \
pkgconfig(raptor2)"

inherit rpm
