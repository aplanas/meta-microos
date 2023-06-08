SUMMARY = "Internationalized Domain Names in Applications (IDNA)"
DESCRIPTION = "A library to support the Internationalised Domain Names in \
Applications (IDNA) protocol as specified in RFC 5891 \
http://tools.ietf.org/html/rfc5891. This version of the protocol \
is often referred to as “IDNA2008” and can produce different \
results from the earlier standard from 2003. \
 \
The library is also intended to act as a suitable drop-in replacement \
for the “encodings.idna” module that comes with the Python standard \
library but currently only supports the older 2003 specification."
LICENSE = "BSD-3-Clause"

PV = "3.4"

RPM_NAME = "python311-idna-3.4-2.1.noarch.rpm"
RPM_HASH = "0924a2f3ea64ee2a316863e1cb96134dffe5a408688d1d01a54d4fb095201925f3ff48bd26c8acff79b3c813d5761d8bd935d37f31ee3b5d2aec6562684cf402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(idna) python311-idna python3dist(idna)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
