SUMMARY = "Development files for qhexedit2"
DESCRIPTION = "The qhexedit2-devel package contains libraries and header files for \
developing applications that use qhexedit2."
LICENSE = "LGPL-2.0-only"

PV = "0.8.9"

RPM_NAME = "qhexedit2-devel-0.8.9-1.15.aarch64.rpm"
RPM_HASH = "48dfb318233055a79bc39eba5bb96a5371ebea66430223d1fbd7d6ba0f099aa15f354f804939ec83d734b885bd74fe23945ff0aec31053c8a02c046094c36be9"

RPROVIDES:${PN} += "pkgconfig(qhexedit2) \
qhexedit2-devel \
qhexedit2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqhexedit4"

inherit rpm
