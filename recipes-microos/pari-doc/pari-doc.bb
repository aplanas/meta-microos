SUMMARY = "Documentation for the PARI Computer Algebra System"
DESCRIPTION = " \
PARI/GP is a computer algebra system designed for computations \
in number theory (factorizations, algebraic number theory, elliptic \
curves) and other entities like matrices, polynomials, \
power series, algebraic numbers, and transcendental functions. \
 \
 \
This package contains the documentation and examples for the PARI Computer Algebra System."
LICENSE = "GPL-2.0-only"

PV = "2.15.3"

RPM_NAME = "pari-doc-2.15.3-1.1.noarch.rpm"
RPM_HASH = "2feafb1df32459bb00c54119ab17de72e096ea45a2e0356e202584397fb0328bb7ef99b1d915dca811d9ea2344b294bf4ad4b59b1e914a9682f7db118943e227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-doc"
RDEPENDS:${PN} += ""

inherit rpm
