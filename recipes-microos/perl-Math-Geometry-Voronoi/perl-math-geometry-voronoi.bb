SUMMARY = "compute Voronoi diagrams from sets of points"
DESCRIPTION = "This module computes Voronoi diagrams from a set of input points. Info on \
Voronoi diagrams can be found here: \
 \
  http://en.wikipedia.org/wiki/Voronoi_diagram \
 \
This module is a wrapper around a C implementation found here: \
 \
  http://www.derekbradley.ca/voronoi.html \
 \
Which is itself a modification of code by Steve Fortune, the inventor of \
the algorithm used (Fortune's algorithm): \
 \
  http://cm.bell-labs.com/who/sjf/ \
 \
I made changes to the C code to allow reading input and writing output \
to/from Perl data-structures. I also modified the memory allocation code to \
use Perl's memory allocator. Finally, I changed all floats to doubles to \
provide better precision and to match Perl's NVs."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.3"

RPM_NAME = "perl-Math-Geometry-Voronoi-1.3-3.35.aarch64.rpm"
RPM_HASH = "63fc325cb8cbadb94aa293779c0f0c99edbdce2f5ee91aaa5a7e88ad3eb6eafca87d18d77560cd0c1cbfccb01d26631a8c23b1ee85b022a58204ae133aa77755"

RPROVIDES:${PN} += "perl(Math::Geometry::Voronoi) perl-Math-Geometry-Voronoi perl-Math-Geometry-Voronoi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(Class::Accessor) perl(Params::Validate)"

inherit rpm
