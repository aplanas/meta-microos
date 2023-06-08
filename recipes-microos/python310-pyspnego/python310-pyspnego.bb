SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python310-pyspnego-0.6.3-1.4.noarch.rpm"
RPM_HASH = "87df174a57c0d054dd6dd276520bcc69d39454edd4161b839f34ac549d21db5bf020cae3c095bc5d8552a5cb9850ca207ee104efe9a487ee2065257ff1dae977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyspnego python3.10dist(pyspnego) python310-pyspnego python3dist(pyspnego)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-cryptography update-alternatives"

inherit rpm
