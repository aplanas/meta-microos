SUMMARY = "Core library for the Tachyon Parallel Ray Tracing System"
DESCRIPTION = "A parallel ray tracing system supporting MPI and multithreaded \
implementations. \
 \
Tachyon implements the basic geometric primitives such as triangles, \
planes, spheres, cylinders, etc. Tachyon parallelizes unlike POV-Ray \
and Rayshade."
LICENSE = "BSD-3-Clause"

PV = "0.99.5"

RPM_NAME = "libtachyon-0_99_5-0.99.5-1.4.aarch64.rpm"
RPM_HASH = "4c7f0d246c2130101a4dce7477948bf9e0dba4d745825e83cf58d274a77d4c047381e1a1a20563dd37aeece871133562c2ab7abb2501268420f11d4dc840f113"

RPROVIDES:${PN} += "libtachyon-0.99.5.so()(64bit) libtachyon-0_99_5 libtachyon-0_99_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
