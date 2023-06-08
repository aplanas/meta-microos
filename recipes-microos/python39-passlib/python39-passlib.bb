SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python39-passlib-1.7.4-4.7.noarch.rpm"
RPM_HASH = "a4399cec4eec27f80cc282f78b78a53ad81e4520701d3cd579cf2240b43aa512980326f9ede08a890acf6add5f08108e9af055c1fb5a455615066f18c6c7446a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(passlib) python39-passlib python3dist(passlib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
