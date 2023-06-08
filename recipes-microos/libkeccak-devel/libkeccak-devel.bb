SUMMARY = "Development files for libkeccak"
DESCRIPTION = "libkeccak is a bit-oriented lanewise implementation of the Keccak \
family with support for extend output size, state marshalling, \
algorithm tuning with implicit parameters, secure erasure of \
sensitive data, and HMAC. \
 \
A subset of Keccak was specified by NIST as SHA-3 (Secure Hash Algorithm 3). \
This package contains the files required for development with libkeccak."
LICENSE = "ISC"

PV = "1.3.1.2"

RPM_NAME = "libkeccak-devel-1.3.1.2-2.3.aarch64.rpm"
RPM_HASH = "db370a1bedd34c2fac951ab56cf1467bfacf6ccd098a76c32d6eca9b8de3eb516756fe1e7a6b7f79775f99eed8e9671492f599d63cb1fa727508dd535daffa2b"

RPROVIDES:${PN} += "libkeccak-devel libkeccak-devel(aarch-64)"
RDEPENDS:${PN} += "libkeccak1"

inherit rpm
