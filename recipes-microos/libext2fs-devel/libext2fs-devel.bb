SUMMARY = "Development files for libext2fs"
DESCRIPTION = "Development files for libext2fs."
LICENSE = "LGPL-2.0-only"

PV = "1.47.0"

RPM_NAME = "libext2fs-devel-1.47.0-1.1.aarch64.rpm"
RPM_HASH = "b0db9ee92412518a68bc27657fc579ebc37c5014e3321f89a2a8cdb0f592d17061b22956d9e3191630ac64e1898b17139bd3c927e063198ae7f4f3361f13c051"

RPROVIDES:${PN} += "libext2fs-devel libext2fs-devel(aarch-64) pkgconfig(e2p) pkgconfig(ext2fs)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcom_err-devel libext2fs2 pkgconfig(com_err)"

inherit rpm
