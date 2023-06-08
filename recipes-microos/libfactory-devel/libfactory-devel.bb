SUMMARY = "Development files for Singular's factorization library"
DESCRIPTION = "Factory is a C++ class library that implements a recursive \
representation of multivariate polynomial data. Factory handles \
sparse multivariate polynomials over different coefficient domains, \
such as Z, Q and GF(q), as well as algebraic extensions over Q and \
GF(q) in an efficient way. Factory includes algorithms for computing \
univariate and multivariate gcds, resultants, chinese remainders, and \
several algorithms to factorize univariate polynomials over the \
integers and over finite fields. \
 \
This package contains the include and library files."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libfactory-devel-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "90b5623986b1c35ffa068a15eacfd1e90c071dbb83511393340d4f79bffaec0730a62218fdf17a8a55b2ee56da5709f2c8068152879acb47f92bc3c606998b14"

RPROVIDES:${PN} += "libfactory-devel libfactory-devel(aarch-64) pkgconfig(factory)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libfactory-4_3_1 pkgconfig(omalloc) pkgconfig(singular_resources)"

inherit rpm
