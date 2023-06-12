SUMMARY = "Development files for libguestfs"
DESCRIPTION = "Development files for libguestfs. \
 \
libguestfs is a set of tools for accessing and modifying virtual machine (VM) \
disk images. You can use this for viewing and editing files inside guests, \
scripting changes to VMs, monitoring disk used/free statistics, P2V, V2V, \
performing partial backups, cloning VMs, and much else besides."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-devel-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "080b85434f515d018868a15fec1ef705ef19ff8d2fdfa53372f22b82a58d2678f135b81d100c9a8cfa7846fba88b8af5a75ca6d27fc9c441583dad95e8136817"

RPROVIDES:${PN} += "libguestfs-devel \
libguestfs-devel(aarch-64) \
pkgconfig(libguestfs)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/pkg-config \
libguestfs0"

inherit rpm
