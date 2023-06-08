SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2.5.2"

RPM_NAME = "python310-virtue-2.5.2-2.1.noarch.rpm"
RPM_HASH = "63e30439c23f88e10deede5f8f9e0b7938af9558e1716e472be94bb69ae679cbef0a8e82b59f06900ba88680712b692c2107bd2c09c677db7be4a0808830f383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtue python3.10dist(virtue) python310-virtue python3dist(virtue)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Twisted python310-attrs python310-click python310-colorama python310-pyrsistent update-alternatives"

inherit rpm
