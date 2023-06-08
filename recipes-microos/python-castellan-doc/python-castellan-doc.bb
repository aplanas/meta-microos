SUMMARY = "Documentation for castellan"
DESCRIPTION = "Castellan is a generic Key Manager interface for OpenStack. \
This package contains the documentation"
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "python-castellan-doc-3.11.0-1.4.noarch.rpm"
RPM_HASH = "7b73c4913e4ab1e4d2d37eade8aac14f81b844173ff2e7b5351e0a59a3e6c49b8dcf02212706875d305de058fc1aa0caf83f6040837c1750cc322c3aa2fa27c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-castellan-doc"
RDEPENDS:${PN} += ""

inherit rpm
