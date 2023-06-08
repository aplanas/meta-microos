SUMMARY = "Development files for libfsapfs"
DESCRIPTION = "Development files for libfsapfs."
LICENSE = "LGPL-3.0-only"

PV = "20221102"

RPM_NAME = "libfsapfs-devel-20221102-3.11.aarch64.rpm"
RPM_HASH = "d97fb13305ac53d5cf36903b4b6e789029b5d7121e6b6e17360fa459d833260c7839ca89d1133182275d8a15c88da4e324fe8964f4722f4c5b55eda51e5da04f"

RPROVIDES:${PN} += "libfsapfs-devel libfsapfs-devel(aarch-64) pkgconfig(libfsapfs)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbfio-devel libfsapfs1"

inherit rpm
