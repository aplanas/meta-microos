SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "23.1"

RPM_NAME = "python310-packaging-23.1-2.1.noarch.rpm"
RPM_HASH = "8da430fa25b8507dce933dca5fd9dc5041c477a981ef1d328c60d622e4bb0f2b7f8b767e02ccabbfb8cf5eb701f2706f9c5d724df5b257cc6b10875bddd1ab3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-packaging python3.10dist(packaging) python310-packaging python3dist(packaging)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
