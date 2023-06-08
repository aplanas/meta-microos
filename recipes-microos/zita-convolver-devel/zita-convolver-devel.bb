SUMMARY = "Development files for zita-convolver"
DESCRIPTION = "Development package for zita-convolver, a partitioned convolution engine \
library."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.3"

RPM_NAME = "zita-convolver-devel-4.0.3-1.15.aarch64.rpm"
RPM_HASH = "c4bc88feed3fdfb375d937cfb54fbd5b7224c3171a53473ffa5da433a74bf22284c2a276c7e96745aeaff731ac5c6d9c89559d9abee5b2608118a2de3e95cbb2"

RPROVIDES:${PN} += "zita-convolver-devel zita-convolver-devel(aarch-64)"
RDEPENDS:${PN} += "libzita-convolver4 pkgconfig(fftw3f)"

inherit rpm
