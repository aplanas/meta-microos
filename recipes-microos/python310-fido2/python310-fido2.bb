SUMMARY = "Python-based FIDO 2.0 library"
DESCRIPTION = "This library supports the FIDO U2F and FIDO 2.0 protocols for communicating \
with a USB authenticator via the Client-to-Authenticator Protocol (CTAP 1 and 2). \
In addition to this low-level device access, classes defined in the fido2.client \
implement higher level device operations."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MPL-2.0"

PV = "1.1.1"

RPM_NAME = "python310-fido2-1.1.1-1.1.noarch.rpm"
RPM_HASH = "47b17cda5c3befd6309d7d04c7704ab3aaf33dc11a594e13307552c1ff91ce2c2c556ab20b5688ca36e7f323b1fb478b4c9f25284691eabea52f9acb28bb9e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fido2 python3.10dist(fido2) python310-fido2 python3dist(fido2)"
RDEPENDS:${PN} += "python(abi) python310-cryptography"

inherit rpm
