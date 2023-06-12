SUMMARY = "Library for manipulating memory bitmaps"
DESCRIPTION = "This package contains libraries for manipulating memory bitmaps."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "libpainter0-0.9.20-7.3.aarch64.rpm"
RPM_HASH = "bee48bd772885ec5675b36f0f2c9532fe091e16a72e79b1f81d323f3e4468e9a47384278a6b840b736174676da4c19ab64198b1cfa193bbb86e5f0977de478e8"

RPROVIDES:${PN} += "libpainter.so.0()(64bit) \
libpainter0 \
libpainter0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
