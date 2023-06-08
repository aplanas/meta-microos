SUMMARY = "Symbolic Computation Program/Computer Algebra System"
DESCRIPTION = "Maxima is a full symbolic computation program.  It is full featured \
doing symbolic manipulation of polynomials, matrices, rational \
functions, integration, Todd-coxeter, graphing, bigfloats.  It has a \
symbolic debugger source level debugger for maxima code.  Maxima is \
based on the original Macsyma developed at MIT in the 1970's.  It is \
quite reliable, and has good garbage collection, and no memory leaks. \
It comes with hundreds of self tests."
LICENSE = "GPL-2.0-or-later"

PV = "5.46.0"

RPM_NAME = "maxima-5.46.0-1.19.aarch64.rpm"
RPM_HASH = "cbf1edbeb2e51b1e3b729cd019b59711061d47befb973d54dad0e85951c3c1b51a349b23598b63dbdfc409002088874fabeae872687d75f41773058664c2826c"

RPROVIDES:${PN} += "maxima maxima(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnuplot maxima_exec plotutils rlwrap"

inherit rpm
