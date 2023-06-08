SUMMARY = "Low bit rate speech codec"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "libcodec2-1_0-1.0.5-1.4.aarch64.rpm"
RPM_HASH = "438eeb448d3515b35ded474cd2c2b33e13e602c4e58156fe36d016004da9f7953516e5609f76793a01ce202c067d7acd2d1d3aafc8d4904a3731bc0e23b65e57"

RPROVIDES:${PN} += "libcodec2-1_0 libcodec2-1_0(aarch-64) libcodec2.so.1.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.32)(64bit)"

inherit rpm
