SUMMARY = "Documentation of GNUplot"
DESCRIPTION = "GNUplot is a command line driven interactive function plotting utility. \
GNUplot supports many different types of terminals, plotters, and \
printers (including many color devices and pseudodevices like LaTeX) \
and can easily be extended to include new devices. \
 \
 \
gnuplot documentation files including the info pages."
LICENSE = "GPL-2.0-or-later & SUSE-Gnuplot"

PV = "5.4.6"

RPM_NAME = "gnuplot-doc-5.4.6-1.1.noarch.rpm"
RPM_HASH = "b3f520220481a4fd2148da26e1c6877b3f1beec4f8aa751bb0cb49dd1292fc2a534b4d68ac8c9700e110f5b6bb6199893340ab3da2e34d5b3365a6f788836a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuplot-doc"
RDEPENDS:${PN} += "/bin/sh gnuplot"

inherit rpm
