SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "11.3.1+git2076"

RPM_NAME = "libgomp1-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "a56fc2fef73eb35b08da8e72231b92e9a24272120204d0980de0189795e45f379aaad22332d8331ca7129ea73d42adffdba04c11573b1e840031268a3f75fc64"

RPROVIDES:${PN} += "libgomp.so.1()(64bit) libgomp.so.1(GOACC_2.0)(64bit) libgomp.so.1(GOACC_2.0.1)(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_2.0)(64bit) libgomp.so.1(GOMP_3.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.0.1)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(GOMP_5.0)(64bit) libgomp.so.1(GOMP_5.0.1)(64bit) libgomp.so.1(GOMP_PLUGIN_1.0)(64bit) libgomp.so.1(GOMP_PLUGIN_1.1)(64bit) libgomp.so.1(GOMP_PLUGIN_1.2)(64bit) libgomp.so.1(GOMP_PLUGIN_1.3)(64bit) libgomp.so.1(OACC_2.0)(64bit) libgomp.so.1(OACC_2.0.1)(64bit) libgomp.so.1(OACC_2.5)(64bit) libgomp.so.1(OACC_2.5.1)(64bit) libgomp.so.1(OACC_2.6)(64bit) libgomp.so.1(OMP_1.0)(64bit) libgomp.so.1(OMP_2.0)(64bit) libgomp.so.1(OMP_3.0)(64bit) libgomp.so.1(OMP_3.1)(64bit) libgomp.so.1(OMP_4.0)(64bit) libgomp.so.1(OMP_4.5)(64bit) libgomp.so.1(OMP_5.0)(64bit) libgomp.so.1(OMP_5.0.1)(64bit) libgomp1 libgomp1-gcc11 libgomp1-gcc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
