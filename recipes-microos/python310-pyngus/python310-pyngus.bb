SUMMARY = "Callback API implemented over Proton"
DESCRIPTION = "A messaging framework built on the QPID Proton engine. It \
provides a callback-based API for message passing"
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "python310-pyngus-2.3.1-1.9.noarch.rpm"
RPM_HASH = "56128173f916579118c3b80f49a0e6014bd7d44652ef7a2e6e4a485da6d36450842f8c6fcae84b1f761301f29d7fbad75ca14f8ce987133a3590a17e3deb4a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyngus python3.10dist(pyngus) python310-pyngus python3dist(pyngus)"
RDEPENDS:${PN} += "python(abi) python310-python-qpid-proton"

inherit rpm
