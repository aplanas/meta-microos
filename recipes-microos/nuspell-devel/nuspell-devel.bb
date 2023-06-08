SUMMARY = "Files for developing with Nuspell"
DESCRIPTION = "Header files and definitions for developing with Nuspell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.2"

RPM_NAME = "nuspell-devel-5.1.2-1.4.aarch64.rpm"
RPM_HASH = "41c9ed730b0997fd442b74387ab3953f2ade29c338916add0d0b853d5254ec450d43f8f123a2c14b813349475a0eb55e17127529df6aabd90192516a72b5dbd6"

RPROVIDES:${PN} += "cmake(Nuspell) nuspell-devel nuspell-devel(aarch-64) pkgconfig(nuspell)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libnuspell5 pkgconfig(icu-uc)"

inherit rpm
