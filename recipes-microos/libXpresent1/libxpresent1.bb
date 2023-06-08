SUMMARY = "An X Window System client interface to the Present extension to the X protocol"
DESCRIPTION = "libXpresent provides an X Window System client interface to the \
Present extension to the X protocol. \
 \
The Present extension provides a way for applications to update their \
window contents from a pixmap in a well defined fashion, \
synchronizing with the display refresh and potentially using a more \
efficient mechanism than copying the contents of the source pixmap."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXpresent1-1.0.1-1.3.aarch64.rpm"
RPM_HASH = "4a7af9fb77f6bd72d1fadf113ead9113be577e6b918a25f0a5df822ee8a87b21778f54a1bc49be6bd32aad55ac12a825f830a2b9359352c46caccbf59fa719fa"

RPROVIDES:${PN} += "libXpresent.so.1()(64bit) libXpresent1 libXpresent1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
