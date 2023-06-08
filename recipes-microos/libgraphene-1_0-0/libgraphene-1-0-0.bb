SUMMARY = "Thin type layer for graphic libraries"
DESCRIPTION = "When creating graphic libraries you most likely end up dealing with points \
and rectangles. If you're particularly unlucky, you may end up dealing \
with affine matrices and 2D transformations. If you're writing a graphic \
library with 3D transformations, though, you are going to hit the jackpot: \
4x4 matrices, projections, transformations, vectors, and quaternions. \
 \
This library provides types and their relative API; it does not deal with \
windowing system surfaces, drawing, scene graphs, or input. You're \
supposed to do that yourself, in your own canvas implementation, which is \
the whole point of writing the library in the first place."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "libgraphene-1_0-0-1.10.8-1.7.aarch64.rpm"
RPM_HASH = "da9c9d5fbc82924c380ab05a13433b9d6bce51b40448ff6ed9c4196941cedb4b3feb965b49ecb3aa563c23db8565b9d466b0be73435abcf48ac582bbb9563de2"

RPROVIDES:${PN} += "libgraphene-1.0.so.0()(64bit) libgraphene-1_0-0 libgraphene-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
