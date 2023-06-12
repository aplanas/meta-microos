SUMMARY = "Development files of lightmediascanner"
DESCRIPTION = "Lightweight media scanner. \
 \
This package contains header files and libraries needed to develop \
application that use lightmediascanner."
LICENSE = "LGPL-2.1"

PV = "0.5.2"

RPM_NAME = "lightmediascanner-devel-0.5.2-2.4.aarch64.rpm"
RPM_HASH = "de05ad28395284e2394cbe10660fef8a325bc96476b66363dfe6b6ac1ca8d5e5c22b41db9bfe647ec3bf71420afc4f5526b76b1ebb31aac57c925bb2b39edfb9"

RPROVIDES:${PN} += "lightmediascanner-devel \
lightmediascanner-devel(aarch-64) \
pkgconfig(lightmediascanner)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblightmediascanner0 \
pkgconfig(sqlite3)"

inherit rpm
