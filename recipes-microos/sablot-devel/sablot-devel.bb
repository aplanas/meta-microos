SUMMARY = "Header Files and Libraries for Sablot Development"
DESCRIPTION = "Header files and libraries needed for sablot development."
LICENSE = "GPL-2.0+"

PV = "1.0.3"

RPM_NAME = "sablot-devel-1.0.3-130.28.aarch64.rpm"
RPM_HASH = "b531e827dcc93770cba174488cfd6ed53f18743692b497f682558c033237abb352413da21a1cafb6653922411fd4a101744e422fee8317f2b5fa6f3d8c38798e"

RPROVIDES:${PN} += "sablot-devel \
sablot-devel(aarch-64) \
sablotd"
RDEPENDS:${PN} += "/bin/sh \
glibc-devel \
sablot"

inherit rpm
