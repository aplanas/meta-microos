SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libgomp1-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "ee85818a11d8437d200362a4313f75d89f6d8af728cc1d701991b95cded06ed065493737b66bba068350786f91b650b6d80c6195d843c9f90702071f30a03197"

RPROVIDES:${PN} += "libgomp.so.1()(64bit) libgomp.so.1(GOACC_2.0)(64bit) libgomp.so.1(GOACC_2.0.1)(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_2.0)(64bit) libgomp.so.1(GOMP_3.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.0.1)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(GOMP_PLUGIN_1.0)(64bit) libgomp.so.1(GOMP_PLUGIN_1.1)(64bit) libgomp.so.1(OACC_2.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libgomp.so.1(OMP_2.0)(64bit) libgomp.so.1(OMP_3.0)(64bit) libgomp.so.1(OMP_3.1)(64bit) libgomp.so.1(OMP_4.0)(64bit) libgomp.so.1(OMP_4.5)(64bit) libgomp1 libgomp1-gcc7 libgomp1-gcc7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
