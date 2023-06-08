SUMMARY = "Python controller library for Tor"
DESCRIPTION = "Cepa is a fork of stem that adds support for v3 onion client authentication. \
 \
Stem is a Python controller library for Tor. \
With it you can use Tor's control protocol to script against the Tor process, or build things such as Nyx."
LICENSE = "LGPL-3.0-only"

PV = "1.8.4"

RPM_NAME = "python39-cepa-1.8.4-2.2.noarch.rpm"
RPM_HASH = "9d276c426da36144aef2b1466407c134b611a4992bbb3a1400cf664df1871422eac87d2913b3ba10ac0d6c9e99d937707a57150f628a97ad5dfc933e46407bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cepa) python39-cepa python39-stem python3dist(cepa)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-cryptography update-alternatives"

inherit rpm
