SUMMARY = "Development files for qpdf PDF manipulation library"
DESCRIPTION = "The qpdf-devel package contains header files and libraries necessary \
for developing programs using the qpdf library."
LICENSE = "Apache-2.0"

PV = "11.3.0"

RPM_NAME = "qpdf-devel-11.3.0-1.3.aarch64.rpm"
RPM_HASH = "54740a621f3333166ed7ab43a8d5dbe712dae398aca45308229bedd3e68c5f3bc132ffe5e7d0cfd510226747fd657971aebd46512bba6951e4e6f4e06a134996"

RPROVIDES:${PN} += "cmake(qpdf) pkgconfig(libqpdf) qpdf-devel qpdf-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libqpdf29 libstdc++-devel pkgconfig(gnutls) pkgconfig(libjpeg) pkgconfig(zlib) qpdf"

inherit rpm
