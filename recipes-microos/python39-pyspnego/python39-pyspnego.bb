SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python39-pyspnego-0.6.3-1.4.noarch.rpm"
RPM_HASH = "22ef6699a944ddc3d195605984bc7b3d358acd330043718421be984a9924a468c787b2603368536d63fa5a26e01587c75045b867f263d0d5ac4a46869f5eda55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyspnego) python39-pyspnego python3dist(pyspnego)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-cryptography update-alternatives"

inherit rpm
