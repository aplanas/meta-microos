SUMMARY = "Plymouth 'breeze' plugin"
DESCRIPTION = "This package contains the 'breeze' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0+"

PV = "5.27.4"

RPM_NAME = "plymouth-theme-breeze-plugin-breeze-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "35a57ac8adec1390792d2a492db94413040dcdd1fa786de2d15dbcbd68c7dc62967877ab2b70bb8ac3191c43602ade404d10bfd091f0cd11816a65ce576f943f"

RPROVIDES:${PN} += "plymouth-theme-breeze-plugin-breeze plymouth-theme-breeze-plugin-breeze(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libply-splash-core.so.5()(64bit) libply.so.5()(64bit)"

inherit rpm
