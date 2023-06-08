SUMMARY = "Header files for the GNU SIP implementation"
DESCRIPTION = "This is the GNU oSIP library. It has been designed to provide the \
Internet community with a simple way to support the Session Initiation \
Protocol. SIP is described in the RFC 3261, which is available at \
http://www.ietf.org/rfc/rfc3261.txt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.1"

RPM_NAME = "libosip2-devel-5.3.1-1.2.aarch64.rpm"
RPM_HASH = "9a9010d00a7b4e00aa3e6e502c201b6ad96baae3e0f1c4f1538bc74f5addda9b1dc74cc1d2f1428168c8ee9f010f559460c436c7897e14b1ff8d08fed5ed6979"

RPROVIDES:${PN} += "libosip2-devel libosip2-devel(aarch-64) libosip2:/usr/include/osip2/osip.h pkgconfig(libosip2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libosip2-15"

inherit rpm
