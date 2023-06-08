SUMMARY = "The library of Deepin Image editor"
DESCRIPTION = "The libimageviewer-devel package contains the header files and developer docs \
for Deepin Image editor."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "libimageviewer-devel-1.0.24-1.1.aarch64.rpm"
RPM_HASH = "014aa2d76b109ad5974b046b9de2308fda229c04f2d6444bb7ca973ec892c7953c76bcbfc06ba95a166c0ab6aaec13e2216bfe58a92d9a9f334b9def7b70599c"

RPROVIDES:${PN} += "libimageviewer-devel libimageviewer-devel(aarch-64) pkgconfig(libimageviewer)"
RDEPENDS:${PN} += "libimageviewer0_1"

inherit rpm
