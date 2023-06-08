SUMMARY = "Multilingual Text Processing Library for the C Language"
DESCRIPTION = "A multilingual text processing library for the C language. \
This package contains m17n-* programs."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "m17n-lib-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "f015e22d733bf95f47ea33a6874369dcc1170b8757c4d572ae8d2cbf375fb11f9a3415bb7c0cbcdd5ac83bdd2604d62038a76ae994f8ebdf72ddca14527dbbdd"

RPROVIDES:${PN} += "m17n-lib m17n-lib(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXt.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgd.so.3()(64bit) libm17n-core.so.0()(64bit) libm17n-flt.so.0()(64bit) libm17n-gui.so.0()(64bit) libm17n.so.0()(64bit)"

inherit rpm
