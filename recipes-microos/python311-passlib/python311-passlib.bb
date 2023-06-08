SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python311-passlib-1.7.4-4.7.noarch.rpm"
RPM_HASH = "31c38df0e067110f195dab074166837d88ae2231e54fc56d5c5f051447e24f4afe9e30b95f64eb283d752af95941eec6b36408f70b425737f6ea08f4d6a9a3ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(passlib) python311-passlib python3dist(passlib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
