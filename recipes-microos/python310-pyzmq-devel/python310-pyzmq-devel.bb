SUMMARY = "Development files for python310-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python310-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "24.0.1"

RPM_NAME = "python310-pyzmq-devel-24.0.1-3.5.aarch64.rpm"
RPM_HASH = "586f8f71fa29d6d5fed7299c4b69408c5db2de5001ce6a336fac5d601f04a19051b9fe29228bfd40df0ea98dcae84fb7d1cf5012c9cb8361a834f3a9e476c776"

RPROVIDES:${PN} += "python3-pyzmq-devel python310-pyzmq-devel python310-pyzmq-devel(aarch-64)"
RDEPENDS:${PN} += "python(abi) python310-devel python310-pyzmq zeromq-devel"

inherit rpm
