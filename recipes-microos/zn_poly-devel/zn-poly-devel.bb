SUMMARY = "Development files for the zn_poly library"
DESCRIPTION = "zn_poly is a C library for polynomial arithmetic in Z/nZ[x], where n \
is any modulus that fits into an unsigned long."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "zn_poly-devel-0.9.2-2.10.aarch64.rpm"
RPM_HASH = "73fc24e6a2e84a9dbba20a968ccdf43c3970fb5b3c58e11cd4eb20c9e494087aa763c75e3c3507743e4bbd7495c732efb93850c4f8eb55ed35a5fe4d0d3f887e"

RPROVIDES:${PN} += "zn_poly-devel zn_poly-devel(aarch-64)"
RDEPENDS:${PN} += "libzn_poly-0_9"

inherit rpm
