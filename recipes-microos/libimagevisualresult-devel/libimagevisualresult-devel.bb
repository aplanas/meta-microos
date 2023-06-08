SUMMARY = "The library of Deepin Image editor"
DESCRIPTION = "The libimagevisualresult-devel package contains the header files and developer \
docs for Deepin Image editor."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "libimagevisualresult-devel-1.0.24-1.1.aarch64.rpm"
RPM_HASH = "717f26fffe2faf5d590f7bf608cc213f056ca312c5bd9629ac66aad5ae28a2dc3c856570889fb58fce193f9c05159275c8bcb8de8d7a6d7772e5de1109fefeb3"

RPROVIDES:${PN} += "libimagevisualresult-devel libimagevisualresult-devel(aarch-64) pkgconfig(libimagevisualresult)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libimagevisualresult0_1"

inherit rpm
