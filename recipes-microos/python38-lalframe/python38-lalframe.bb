SUMMARY = "LSC Algorithm Frame Library for gravitational wave data analysis"
DESCRIPTION = "The LSC Algorithm Frame Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python38-lalframe-2.0.1-1.2.aarch64.rpm"
RPM_HASH = "25dd1d8440d312e95eebf3a7a5e2ab35d0351a7dfcf1ffa7383ac4b379a7b9ffebefe58fc32dff1f39fb68a12cc1b7b6ba37171de01f48b8ab1ff769b85a60d9"

RPROVIDES:${PN} += "python38-lalframe python38-lalframe(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblal.so.20()(64bit) liblalframe.so.13()(64bit) liblalsupport.so.14()(64bit) python(abi) python38-lal python38-numpy"

inherit rpm
