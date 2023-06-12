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

RPM_NAME = "python310-idna-3.4-2.1.noarch.rpm"
RPM_HASH = "7ad86dc33c4c00f0b804c3d5337b9b1fed6fbc7b0cbeeb68b67f7b61c416dee9375867dfaa5b1e7a85fc8bf4708656852943c2757a868d4ff71b18455c3e6a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-idna \
python3.10dist(idna) \
python310-idna \
python3dist(idna)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
