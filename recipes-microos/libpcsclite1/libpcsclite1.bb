SUMMARY = "PC/SC Smart Card Library"
DESCRIPTION = "PC/SC Lite provides a Windows SCard interface in a small form factor \
for communication with smart cards and readers. \
 \
Security aware people should read the SECURITY file for possible \
vulnerabilities of pcsclite and how to fix them. For information on how \
to install drivers please read the DRIVERS file. \
 \
Memory cards will be supported through the MCT specification, which is \
an APDU like manner sent normally through the SCardTransmit() function. \
This functionality is exercised in the driver."
LICENSE = "BSD-3-Clause"

PV = "1.9.9"

RPM_NAME = "libpcsclite1-1.9.9-2.3.aarch64.rpm"
RPM_HASH = "c1862537003a7e90a3a750cf8e941fc1cf5c4678ec456dbc09923f9509875710de7b62cd550bf3a663a25f2eb412d82d542adaa22ead7dcba3fe3048ef035612"

RPROVIDES:${PN} += "libpcsclite.so.1()(64bit) libpcsclite1 libpcsclite1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
