SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libfdisk-devel-static-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "ae44b1d152b05f6bfe3ec9dfd247bd63d7945c625f6b8e6304b8c6a50317a833230f087f6603ab24be7ff4a6cb74d904091b116ec2e29e04459f79a4770fe837"

RPROVIDES:${PN} += "libfdisk-devel-static libfdisk-devel-static(aarch-64)"
RDEPENDS:${PN} += "libfdisk-devel"

inherit rpm
