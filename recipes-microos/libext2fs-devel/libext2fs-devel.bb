SUMMARY = "Development files for libext2fs"
DESCRIPTION = "Development files for libext2fs."
LICENSE = "LGPL-2.0-only"

PV = "1.46.5"

RPM_NAME = "libext2fs-devel-1.46.5-4.3.aarch64.rpm"
RPM_HASH = "9c6fc1516f7bbd8170505c16c70dea4d878a79c80d4d7f8e1a2eea1fe92eb6a0ccabb90b7fce09acb2c0145d7ac07ba9925dcb1ba09bedb8077255f2d819b218"

RPROVIDES:${PN} += "libext2fs-devel libext2fs-devel(aarch-64) pkgconfig(e2p) pkgconfig(ext2fs)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcom_err-devel libext2fs2 pkgconfig(com_err)"

inherit rpm
