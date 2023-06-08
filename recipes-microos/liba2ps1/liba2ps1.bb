SUMMARY = "Library to convert ASCII/Latin text into PostScript"
DESCRIPTION = "The library liba2ps used by the program a2ps to convert ASCII text into PostScript."
LICENSE = "GPL-3.0-or-later"

PV = "4.15"

RPM_NAME = "liba2ps1-4.15-1.3.aarch64.rpm"
RPM_HASH = "3184097fc76cded1e82f21da1507731db7536f1fa77bd4369c80a2679d1b826a4c735bb5f867335812708c74e406a5dc2154b7af7ed6280055b482e7282890b0"

RPROVIDES:${PN} += "liba2ps.so.1()(64bit) liba2ps1 liba2ps1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
