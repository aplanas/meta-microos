SUMMARY = "Jupyter Python Comm implementation"
DESCRIPTION = "Comm provides a way to register a Kernel Comm implementation, \
as per the Jupyter kernel protocol. It also provides a base \
Comm implementation and a default CommManager that can be used."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python39-comm-0.1.3-1.1.noarch.rpm"
RPM_HASH = "16f4365c2c4d58f9eb0dfe387e9a99a32dbc6e9b110dcedd7868e6679c99ea2ba39a3ff991bbb61ac9acded5c33f413b06e14ba0280da5388a2cd1f21c72f389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(comm) python39-comm python3dist(comm)"
RDEPENDS:${PN} += "python(abi) python39-traitlets"

inherit rpm
