SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python39-passlib-1.7.4-5.1.noarch.rpm"
RPM_HASH = "b6747fc2cc565f2e7ae2a8fed1df381c4c4ab65e06ceb7bc061565e096796fc887dd9b84d3a0d1d613cede619ac2c35cd6490a9a0956e467b03db9f6d7d54ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(passlib) python39-passlib python3dist(passlib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
