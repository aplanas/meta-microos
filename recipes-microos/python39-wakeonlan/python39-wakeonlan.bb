SUMMARY = "A small python module for wake on lan"
DESCRIPTION = "A small python module for wake on lan."
LICENSE = "WTFPL"

PV = "2.1.0"

RPM_NAME = "python39-wakeonlan-2.1.0-1.11.noarch.rpm"
RPM_HASH = "53eba1d176a8988a41da3ee062d564e24e7585bfc3fc31cca0dc0f8858f56d0f6ed6c243a74e32b3a8369acc4cae3334cb2a1ece493cb47e99ee8f545f04bfd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wakeonlan) python39-wakeonlan python3dist(wakeonlan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
