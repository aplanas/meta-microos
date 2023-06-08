SUMMARY = "Development files for libext2fs"
DESCRIPTION = "Development files for libext2fs. Static libraries."
LICENSE = "LGPL-2.0-only"

PV = "1.46.5"

RPM_NAME = "libext2fs-devel-static-1.46.5-4.3.aarch64.rpm"
RPM_HASH = "8f455f7ae711233db5df7b0d72cfa59a9d11908854f15fe31c52c4f3488e1bd11a4f39769f27d4299bcadf277c86e526d176c93320319b9551b7889520930b7e"

RPROVIDES:${PN} += "libext2fs-devel-static libext2fs-devel-static(aarch-64) libext2fs-devel:/usr/lib64/libe2p.a libext2fs-devel:/usr/lib64/libext2fs.a"
RDEPENDS:${PN} += "libext2fs-devel"

inherit rpm
