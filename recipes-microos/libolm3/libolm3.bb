SUMMARY = "Double Ratchet cryptographic library as a C API"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Double Ratchet cryptographic library as a C API"
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "libolm3-3.2.14-1.5.aarch64.rpm"
RPM_HASH = "9940c3c4153dba89052011404f300cc5db950dd890cf89d24c0e1fb2a15b9975921eb257914b6141e4a33f7164e328c590895b23096181f7403a78dfbf934871"

RPROVIDES:${PN} += "libolm.so.3()(64bit) libolm3 libolm3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
