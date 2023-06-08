SUMMARY = "Python-based FIDO 2.0 library"
DESCRIPTION = "This library supports the FIDO U2F and FIDO 2.0 protocols for communicating \
with a USB authenticator via the Client-to-Authenticator Protocol (CTAP 1 and 2). \
In addition to this low-level device access, classes defined in the fido2.client \
implement higher level device operations."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MPL-2.0"

PV = "1.1.1"

RPM_NAME = "python311-fido2-1.1.1-1.1.noarch.rpm"
RPM_HASH = "6c9292ab5362fe18d216eee704615ec0171cb1e1255ea8742a5d8bd289aa7795e888ce7707ec1f5e641bb6d20d4b63d999f04cd7d8d4784f946861b329127031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fido2) python311-fido2 python3dist(fido2)"
RDEPENDS:${PN} += "python(abi) python311-cryptography"

inherit rpm
