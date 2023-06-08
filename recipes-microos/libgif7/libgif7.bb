SUMMARY = "A Library for Working with GIF Images"
DESCRIPTION = "This Library allows manipulating GIF Image files. Since the LZW patents \
have expired, giflib can again be used instead of libungif."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "libgif7-5.2.1-3.3.aarch64.rpm"
RPM_HASH = "51857b631d4e4247ca13d49df186118640e8e3ee38fabad2cc478869b0c2997e2c486be4d3d03b3c3bf6363204073a889e05291c7756df5eb73311cd44df14c7"

RPROVIDES:${PN} += "libgif.so.7()(64bit) libgif7 libgif7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
