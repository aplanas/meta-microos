SUMMARY = "A small python module for wake on lan"
DESCRIPTION = "A small python module for wake on lan."
LICENSE = "WTFPL"

PV = "2.1.0"

RPM_NAME = "python310-wakeonlan-2.1.0-1.11.noarch.rpm"
RPM_HASH = "4c9fb220449b6022c78f880a457bce9d8f0996f5589583b20923645484c3fb824cef9be99622df067594b0589987ae10a13d5d99dac5e75748114e4d739d262d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wakeonlan python3.10dist(wakeonlan) python310-wakeonlan python3dist(wakeonlan)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
