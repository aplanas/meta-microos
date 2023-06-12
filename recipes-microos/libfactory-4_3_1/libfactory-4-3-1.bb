SUMMARY = "Singular's factorization library"
DESCRIPTION = "Factory is a C++ class library that implements a recursive \
representation of multivariate polynomial data. Factory handles \
sparse multivariate polynomials over different coefficient domains, \
such as Z, Q and GF(q), as well as algebraic extensions over Q and \
GF(q) in an efficient way. Factory includes algorithms for computing \
univariate and multivariate gcds, resultants, chinese remainders, and \
several algorithms to factorize univariate polynomials over the \
integers and over finite fields."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libfactory-4_3_1-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "b8482ab424d99246799c7c3b6c3cd7751e0844925a62ffa1de2b26ebe9936c0fbaa2a9535489207dd36d876b5fc2f14dcc81d858f94fe4ef69f0c95b24789af1"

RPROVIDES:${PN} += "libfactory-4.3.1.p3.so()(64bit) \
libfactory-4_3_1 \
libfactory-4_3_1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libflint.so.17()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libntl.so.44()(64bit) \
libomalloc-4.3.1.p3.so()(64bit) \
libsingular_resources-4.3.1.p3.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
