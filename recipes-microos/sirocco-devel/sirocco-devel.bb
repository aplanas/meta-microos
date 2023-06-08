SUMMARY = "Development files for sirocco, a math library"
DESCRIPTION = "This is a library for computing homotopy continuation of a given root of one \
dimensional sections of bivariate complex polynomials. \
 \
The output is a piecewise linear approximation of the path followed \
by the root, with the property that there is a tubular neighborhood, \
with square transversal section, that contains the actual path, and \
there is a three times thicker tubular neighborhood guaranted to \
contain no other root of the polynomial. This second property ensures \
that the piecewise linear approximation computed from all roots of a \
polynomial form a topologically correct deformation of the actual \
braid, since the inner tubular neighborhoods cannot intersect. \
 \
This subpackage contains the include files and library links for \
developing with the sirocco library."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "sirocco-devel-2.1.0-1.8.aarch64.rpm"
RPM_HASH = "d0d48911ebdd52d0c28213c52cd02fa8aaaa280752966556bd306b1dc29b71866d05fd922d91e6119b3b4b2ee45b049689ed0d9631dff7f6d6c2dbc7f3c19d15"

RPROVIDES:${PN} += "sirocco-devel sirocco-devel(aarch-64)"
RDEPENDS:${PN} += "libsirocco0"

inherit rpm
