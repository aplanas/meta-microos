SUMMARY = "PAPI runtime library"
DESCRIPTION = "This package contains the PAPI runtime library."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "libpapi_7_0_0-hpc-7.0.0-1.3.aarch64.rpm"
RPM_HASH = "a2e40fb6e3f14d480152597ad7c9d507f94bcc0872a47e4088febfa3c185fc8dde0608516a39206a173806590ee6019b65547e7fbde2e48e1428b941e5c1f670"

RPROVIDES:${PN} += "libpapi_7_0_0-hpc libpapi_7_0_0-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpfm.so.4()(64bit)"

inherit rpm
