SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) - Ruby bindings"
DESCRIPTION = "ObexFTP works out-of-the-box with all protocols supported by OpenOBEX. \
Currently IrDA, BlueTooth, and Serial. \
 \
This package contains the Ruby bindings."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "ruby-obexftp-0.24.2-1.22.aarch64.rpm"
RPM_HASH = "9c48d75047fc3f4759b9aa4bae663458dcb25790ccfe9752a960312452f80981933e989f0618b2f434b8052136fcec24de4c94fd5f7aff3609ada5467422f5de"

RPROVIDES:${PN} += "ruby-obexftp ruby-obexftp(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libobexftp.so.0()(64bit) obexftp ruby(abi)"

inherit rpm
