SUMMARY = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it"
DESCRIPTION = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-ephemeral-port-reserve-1.1.4-2.1.noarch.rpm"
RPM_HASH = "ff6bae088a9b697e49f95fc6421e37e5a8f182a02e4ee8aadb378a1a15f375c3e2e9e4b9d00e910ea29a452a409daeee09030836753190b447b1e4fb0e6bb0ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ephemeral-port-reserve python3.10dist(ephemeral-port-reserve) python310-ephemeral-port-reserve python3dist(ephemeral-port-reserve)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
