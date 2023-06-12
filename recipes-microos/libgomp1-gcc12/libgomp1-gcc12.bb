SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libgomp1-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "63228d196703774dbbe6580b9e33f0bbdbb187da3225777841f3adae5ada1d420cacb561f1081baf0048c11f90fa40f26aa358a17a98ad678f541226f95335a3"

RPROVIDES:${PN} += "libgomp.so.1()(64bit) \
libgomp.so.1(GOACC_2.0)(64bit) \
libgomp.so.1(GOACC_2.0.1)(64bit) \
libgomp.so.1(GOACC_2.0.2)(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_2.0)(64bit) \
libgomp.so.1(GOMP_3.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.0.1)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libgomp.so.1(GOMP_5.0)(64bit) \
libgomp.so.1(GOMP_5.0.1)(64bit) \
libgomp.so.1(GOMP_5.1)(64bit) \
libgomp.so.1(GOMP_PLUGIN_1.0)(64bit) \
libgomp.so.1(GOMP_PLUGIN_1.1)(64bit) \
libgomp.so.1(GOMP_PLUGIN_1.2)(64bit) \
libgomp.so.1(GOMP_PLUGIN_1.3)(64bit) \
libgomp.so.1(OACC_2.0)(64bit) \
libgomp.so.1(OACC_2.0.1)(64bit) \
libgomp.so.1(OACC_2.5)(64bit) \
libgomp.so.1(OACC_2.5.1)(64bit) \
libgomp.so.1(OACC_2.6)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgomp.so.1(OMP_2.0)(64bit) \
libgomp.so.1(OMP_3.0)(64bit) \
libgomp.so.1(OMP_3.1)(64bit) \
libgomp.so.1(OMP_4.0)(64bit) \
libgomp.so.1(OMP_4.5)(64bit) \
libgomp.so.1(OMP_5.0)(64bit) \
libgomp.so.1(OMP_5.0.1)(64bit) \
libgomp.so.1(OMP_5.0.2)(64bit) \
libgomp.so.1(OMP_5.1)(64bit) \
libgomp1 \
libgomp1-gcc12 \
libgomp1-gcc12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
