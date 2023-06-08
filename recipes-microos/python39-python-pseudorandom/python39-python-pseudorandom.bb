SUMMARY = "A Python library for generating pseudorandom condition"
DESCRIPTION = "A package for pseudorandomization of DataMatrix objects. That is, it allows \
you to apply certain constraints to the randomization."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.2"

RPM_NAME = "python39-python-pseudorandom-0.2.2-3.6.noarch.rpm"
RPM_HASH = "df1e786f500ff9218a1af524ff1381d42669032d2ddab6496c475ec6a6bc1ddb6f10effffa4175b702b4e838ca7661da86b5019c1c200d8ec19569fccb2edbe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-pseudorandom) python39-python-pseudorandom python3dist(python-pseudorandom)"
RDEPENDS:${PN} += "python(abi) python39-python-datamatrix"

inherit rpm
