SUMMARY = "Python controller library for Tor"
DESCRIPTION = "Cepa is a fork of stem that adds support for v3 onion client authentication. \
 \
Stem is a Python controller library for Tor. \
With it you can use Tor's control protocol to script against the Tor process, or build things such as Nyx."
LICENSE = "LGPL-3.0-only"

PV = "1.8.4"

RPM_NAME = "python311-cepa-1.8.4-2.2.noarch.rpm"
RPM_HASH = "b41cac27dc9964b1071ebf4af212cc7c9807f98076f151e419f9807bb45c67646aa392cdcfbe1272dafd8d63ab8767d9d001fa521daa0f3689ad9e6f625f2e51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cepa) python311-cepa python311-stem python3dist(cepa)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-cryptography update-alternatives"

inherit rpm
