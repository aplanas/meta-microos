SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libmount-devel-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "2310dd9dd3dfca1df20a266512d79187ad49162d498d6bc0d8177846a1d283d3b7043d50f027d37d5b0e00bc71cb1f89d8c32b5800ce5e0e178fbb1f34fa1fc3"

RPROVIDES:${PN} += "libmount-devel libmount-devel(aarch-64) pkgconfig(mount)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmount1 pkgconfig(blkid) pkgconfig(libselinux)"

inherit rpm
