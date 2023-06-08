SUMMARY = "Adaptive Entropy Coding library"
DESCRIPTION = "Libaec provides lossless compression of signed or unsigned integers \
(samples) of sizes 1 to 32 bits wide. The library achieves best \
results for low entropy data as often encountered in space imaging \
instrument data or numerical model output from weather or climate \
simulations. While floating point representations are not directly \
supported, they can also be efficiently coded by grouping exponents \
and mantissa. \
 \
Libaec implements Golomb Rice coding as defined in the Space Data \
System Standard documents 121.0-B-3 and 120.0-G-2."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "libaec0-1.0.6-1.7.aarch64.rpm"
RPM_HASH = "2f214009ed0488e25383c7cb1331ab0178a986cc6385e51ee42896fd27f43f54ba0b3665cdade97c848a1132812ebc2694e605c44f38cee3cf095eada549b3aa"

RPROVIDES:${PN} += "libaec.so.0()(64bit) libaec0 libaec0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
