SUMMARY = "Elliptic Curve Method for Integer Factorization"
DESCRIPTION = "GMP-ECM reads the numbers to be factored from stdin (one number on each \
line) and requires a numerical parameter, the stage 1 bound B1. A reasonable \
stage 2 bound B2 for the given B1 is chosen by default, but can be overridden \
by a second numerical parameter. By default, GMP-ECM uses the ECM factoring \
algorithm."
LICENSE = "GPL-3.0-only"

PV = "7.0.5"

RPM_NAME = "gmp-ecm-7.0.5-1.3.aarch64.rpm"
RPM_HASH = "2d42857dbeac13363e32c8daee05ffccd96d3ab3587c519bc4f83f4d7f552a20bc66e86a78df4cf57f0a8d7fc11ce7c1de77127d82bdf9dcbf055d81d325ec8b"

RPROVIDES:${PN} += "gmp-ecm gmp-ecm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libecm.so.1()(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
