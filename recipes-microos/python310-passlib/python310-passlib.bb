SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python310-passlib-1.7.4-4.7.noarch.rpm"
RPM_HASH = "168c5305f3a93f2475419e7ab68d51e4becffc2684378d2c0dedf301e2cff5d1b7fa5991b80f8bf08383658331a4ccc3ee3b83af83196764f18a4426e433435e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-passlib python3.10dist(passlib) python310-passlib python3dist(passlib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
