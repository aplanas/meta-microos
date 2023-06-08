SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.0.1+git7231"

RPM_NAME = "libgomp1-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "8096eaf5829d64b75a84276cae33a46a03891d62de7538f10c224da0a2e6ff5889bc0b3d4d4631d793829f23d0ecc6d56f46448a32c7867f181a1d58585f7d49"

RPROVIDES:${PN} += "libgomp.so.1()(64bit) libgomp.so.1(GOACC_2.0)(64bit) libgomp.so.1(GOACC_2.0.1)(64bit) libgomp.so.1(GOACC_2.0.2)(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_2.0)(64bit) libgomp.so.1(GOMP_3.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.0.1)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(GOMP_5.0)(64bit) libgomp.so.1(GOMP_5.0.1)(64bit) libgomp.so.1(GOMP_5.1)(64bit) libgomp.so.1(GOMP_5.1.1)(64bit) libgomp.so.1(GOMP_PLUGIN_1.0)(64bit) libgomp.so.1(GOMP_PLUGIN_1.1)(64bit) libgomp.so.1(GOMP_PLUGIN_1.2)(64bit) libgomp.so.1(GOMP_PLUGIN_1.3)(64bit) libgomp.so.1(GOMP_PLUGIN_1.4)(64bit) libgomp.so.1(OACC_2.0)(64bit) libgomp.so.1(OACC_2.0.1)(64bit) libgomp.so.1(OACC_2.5)(64bit) libgomp.so.1(OACC_2.5.1)(64bit) libgomp.so.1(OACC_2.6)(64bit) libgomp.so.1(OMP_1.0)(64bit) libgomp.so.1(OMP_2.0)(64bit) libgomp.so.1(OMP_3.0)(64bit) libgomp.so.1(OMP_3.1)(64bit) libgomp.so.1(OMP_4.0)(64bit) libgomp.so.1(OMP_4.5)(64bit) libgomp.so.1(OMP_5.0)(64bit) libgomp.so.1(OMP_5.0.1)(64bit) libgomp.so.1(OMP_5.0.2)(64bit) libgomp.so.1(OMP_5.1)(64bit) libgomp.so.1(OMP_5.1.1)(64bit) libgomp.so.1(OMP_5.2)(64bit) libgomp1 libgomp1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
