SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.0.1+git7231"

RPM_NAME = "libm2iso18-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "8f22c9bb1f5ad9969c0bd45c636be5a7dcdaf32847c3370e34065d415aa780a46507bca94b15d4d37f07abd6247c05a95c03dcb0e7a891ba7350cc0a42f1e2f9"

RPROVIDES:${PN} += "libm2iso.so.18()(64bit) libm2iso18 libm2iso18(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
