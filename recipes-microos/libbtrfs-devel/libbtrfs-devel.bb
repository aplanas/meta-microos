SUMMARY = "Include Files and Libraries for developing with Btrfs"
DESCRIPTION = "This package contains the libraries and headers files for developers to \
build applications to interface with Btrfs."
LICENSE = "GPL-2.0-only"

PV = "6.1.3"

RPM_NAME = "libbtrfs-devel-6.1.3-5.1.aarch64.rpm"
RPM_HASH = "f54eecc1381b71dba82dad73ac340661151ce9d1042437fae7470bf7b3278d8cef44a8de892ce4df90e6e3ae8354565a47c91275e3ac95035c4247d8992edaec"

RPROVIDES:${PN} += "libbtrfs-devel libbtrfs-devel(aarch-64)"
RDEPENDS:${PN} += "btrfsprogs libbtrfs0"

inherit rpm
