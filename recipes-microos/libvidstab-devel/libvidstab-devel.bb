SUMMARY = "Development files for libvidstab1_1"
DESCRIPTION = "Development (headers and libraries) files for libvidstab1_1."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "libvidstab-devel-1.1.0-2.19.aarch64.rpm"
RPM_HASH = "08bdfc5d18c4a7c3861b2a0322805d8bc39cee823a87a93450cfc75fb9ae4da0d130e4464912f060cac2a94e57026a777653454612f9cdddce7c1e96f42fe9a0"

RPROVIDES:${PN} += "libvidstab-devel \
libvidstab-devel(aarch-64) \
pkgconfig(vidstab)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvidstab1_1"

inherit rpm
