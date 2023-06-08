SUMMARY = "Development headers and libraries for libint"
DESCRIPTION = "LIBINT computes the Coulomb and exchange integrals, which in electronic \
structure theory are called electron repulsion integrals (ERIs). This is by \
far the most common type of integrals in molecular structure theory. \
 \
LIBINT uses recursive schemes that originate in seminal Obara-Saika method and \
Head-Gordon and Pople’s variation thereof. The idea of LIBINT is to optimize \
computer implementation of such methods by implementing an optimizing compiler \
to generate automatically highly-specialized code that runs well on \
super-scalar architectures. \
 \
This package contains development headers and libraries for libint."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libint-devel-2.7.2-2.3.aarch64.rpm"
RPM_HASH = "9ed341062abe99c60bed37d551686f9a60c082f80d16b9a0af477583861b03b6b7178cb09bbe19185575995f11450689612d7a30b9cf2ee50449375cb473223b"

RPROVIDES:${PN} += "libint-devel libint-devel(aarch-64) pkgconfig(libint2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config eigen3-devel libint2-2"

inherit rpm
