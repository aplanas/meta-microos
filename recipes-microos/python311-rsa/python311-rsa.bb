SUMMARY = "Pure-Python RSA Implementation"
DESCRIPTION = "Python-RSA is a pure-Python RSA implementation. It supports encryption and \
decryption, signing and verifying signatures, and key generation according to \
PKCS#1 version 1.5."
LICENSE = "Apache-2.0"

PV = "4.9"

RPM_NAME = "python311-rsa-4.9-2.1.noarch.rpm"
RPM_HASH = "24ab9a998023ae782911eda04bc542a7fed8551b8071c00d5adc7cd043584425d47226383b1ffc9d5db601569c59380fce2dd9384caf33e6594e937707b3a26f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rsa) python311-rsa python3dist(rsa)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 alts coreutils python(abi) python311-pyasn1"

inherit rpm
