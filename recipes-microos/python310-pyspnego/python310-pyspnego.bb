SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-pyspnego-0.9.0-1.1.noarch.rpm"
RPM_HASH = "2bcc1d3f183a8dfa45d9a6b749a7407c3c7ae1ca3061139d3e556f1da40d474f81160a6f30c6979bd293148403059c564431bdff564205824150956fadf43707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyspnego python3.10dist(pyspnego) python310-pyspnego python3dist(pyspnego)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-cryptography update-alternatives"

inherit rpm
