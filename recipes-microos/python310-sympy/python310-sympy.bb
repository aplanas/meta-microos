SUMMARY = "Computer algebra system (CAS) in Python"
DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become \
a full-featured computer algebra system (CAS) while keeping the code \
as simple as possible in order to be comprehensible and easily \
extensible. SymPy is written entirely in Python and does not require \
any external libraries."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "python310-sympy-1.11.1-1.4.noarch.rpm"
RPM_HASH = "21de4d3c24f507c37aaf71f0949d9eba8921baba2348189c0281be865823e43c4735ceda5181f410b6d13ad65ea3c32fd807fe5ca3ea073fb50bd55257c4deb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sympy \
python3.10dist(sympy) \
python310-sympy \
python3dist(sympy)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-mpmath \
python310-setuptools \
update-alternatives"

inherit rpm
