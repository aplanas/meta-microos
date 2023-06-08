SUMMARY = "Computer algebra system (CAS) in Python"
DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become \
a full-featured computer algebra system (CAS) while keeping the code \
as simple as possible in order to be comprehensible and easily \
extensible. SymPy is written entirely in Python and does not require \
any external libraries."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "python39-sympy-1.11.1-1.4.noarch.rpm"
RPM_HASH = "a2265d90341d045697eb90657a2ab8dd65d62343855b29eafc71f0620999d38aa5767b9b782edc4f4c315c5db6329048d123d4ba17d13fac3aa026327d290a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sympy) python39-sympy python3dist(sympy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-mpmath python39-setuptools update-alternatives"

inherit rpm
