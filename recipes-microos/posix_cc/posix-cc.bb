SUMMARY = "POSIX 1003.2 and 1003.1 2001 C Language Compilers"
DESCRIPTION = "c89 is the name of the C language compiler as required by the POSIX \
1003.2 standard, while c99 is the name required by the POSIX 1003.1 \
2001 standard. Both are actually wrappers for gcc, passing it the \
options required to make it conform to said standards in addition to \
the options passed via the command line. \
 \
Both will only accept those options mandated by the respective \
standards."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "posix_cc-1.4-513.12.aarch64.rpm"
RPM_HASH = "4572ed35f072f6c48ea6a6f42ad55627c6e54863241bd2585c8f1f9d644fe309fb9237ad8ec9ab8d8835341180373d47261841f86484ffbd5f09680d31bb5b3e"

RPROVIDES:${PN} += "posix_cc posix_cc(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
