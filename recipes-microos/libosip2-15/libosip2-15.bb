SUMMARY = "Implementation of SIP (RFC 3261)"
DESCRIPTION = "This is the GNU oSIP library. It has been designed to provide the \
Internet community with a simple way to support the Session Initiation \
Protocol. SIP is described in the RFC 3261, which is available at \
http://www.ietf.org/rfc/rfc3261.txt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.1"

RPM_NAME = "libosip2-15-5.3.1-1.2.aarch64.rpm"
RPM_HASH = "bc6f51f35833f4629a3ac14eb64151d66ea1df37d5e7bd78a06b392241af6b1ab25a36b3c7488dd9d46648449bc78c57101a5efcaa75e988258e8fb8184e3c17"

RPROVIDES:${PN} += "libosip2-15 \
libosip2-15(aarch-64) \
libosip2.so.15()(64bit) \
libosipparser2.so.15()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
