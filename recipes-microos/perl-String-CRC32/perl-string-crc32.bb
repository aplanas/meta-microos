SUMMARY = "Perl interface for cyclic redundancy check generation"
DESCRIPTION = "The *CRC32* module calculates CRC sums of 32 bit lengths as integers. It \
generates the same CRC values as ZMODEM, PKZIP, PICCHECK and many others. \
 \
Despite its name, this module is able to compute the checksum of files as \
well as strings."
LICENSE = "SUSE-Public-Domain"

PV = "2.100"

RPM_NAME = "perl-String-CRC32-2.100-1.12.aarch64.rpm"
RPM_HASH = "a482744085ec6979a8eb62a18755da46add6208ddc6a510d5be0c326f14d7c6f77e87c20ed7575d3d3a93ded635dc1394e205e0dbfc8ba483cb82a1891854ae0"

RPROVIDES:${PN} += "perl(String::CRC32) perl-String-CRC32 perl-String-CRC32(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
