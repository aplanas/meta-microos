SUMMARY = "An implementation of the WS-MAN specification"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
Web Services for Management (WS-MAN) is a specification for managing \
computer systems using web services standards. \
 \
This subpackage provides the client libraries of OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman_client5-2.7.2-2.5.aarch64.rpm"
RPM_HASH = "c9960b62b6b6a352f3c137d8482cfc616406bbe802c0caa50a32acb90742e006f3c6ecea39a424563c9c1c46c4cb4e17ac16f1413fe02cbfd3cbdac27e0c9028"

RPROVIDES:${PN} += "config(libwsman_client5) \
libwsman_client.so.5()(64bit) \
libwsman_client5 \
libwsman_client5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libwsman_curl_client_transport.so.1()(64bit)"

inherit rpm
