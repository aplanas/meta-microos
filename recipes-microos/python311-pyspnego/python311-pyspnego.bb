SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python311-pyspnego-0.6.3-1.4.noarch.rpm"
RPM_HASH = "0b6b6fbe41775c71fa10dfebdc9feb341b70ba30219f9f502644553ec0869d53fe6b8c4eec043675d3dd9a00ed011f4a8d8bf06d000fdf64a795fbb7836903cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyspnego) python311-pyspnego python3dist(pyspnego)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-cryptography update-alternatives"

inherit rpm
