SUMMARY = "Headers and libraries for developing applications using PowerMan"
DESCRIPTION = "Header files, pkg-config file and man pages for developing applications using PowerMan."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.26"

RPM_NAME = "powerman-devel-2.3.26-4.3.aarch64.rpm"
RPM_HASH = "3d02afcfd036d373da8923f12eaa1036f2d1d2adefdd9900d8664f00a3a3ad042c566fb9352886185bd25cd64e885528110225a6934f27267b0178ef19646e14"

RPROVIDES:${PN} += "pkgconfig(libpowerman) powerman-devel powerman-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpowerman0"

inherit rpm
