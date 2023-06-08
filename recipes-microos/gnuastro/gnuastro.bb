SUMMARY = "GNU Astronomy Utilities"
DESCRIPTION = "The GNU Astronomy Utilities (Gnuastro) contains various programs and \
library functions for the manipulation and analysis of astronomical \
data."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-0.19-1.10.aarch64.rpm"
RPM_HASH = "7e5d6060a3bd1e8f32b9c94ff49ffd67be17a13b0eea1c8cb3d8a15eb0907ac9cfa56f3e1f8bec22d73d65a491ee218ab2a264073b1324985974cc13dec7e934"

RPROVIDES:${PN} += "config(gnuastro) gnuastro gnuastro(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcfitsio.so.10()(64bit) libgnuastro.so.17()(64bit) libgsl.so.27()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libwcs.so.7()(64bit)"

inherit rpm
