SUMMARY = "Development Files for libburn"
DESCRIPTION = "Development files for developing applications using libisoburn."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "libisoburn-devel-1.5.4-1.10.aarch64.rpm"
RPM_HASH = "d891aca81b2bda15ddc63ac3d01721aa26c7de6baf19ecd05f15ade195fd658f396c1198b084b160c84fec2bafdd0ab2330f61335dd198bd76e98c2dd6b7025c"

RPROVIDES:${PN} += "libburnia-devel libisoburn-devel libisoburn-devel(aarch-64) pkgconfig(libisoburn-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libburn-devel libisoburn1 libisofs-devel"

inherit rpm
