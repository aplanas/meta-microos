SUMMARY = "Documentation and examples for python310-watchdog"
DESCRIPTION = "This package contains documentation and examples for python310-watchdog."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python310-watchdog-doc-3.0.0-1.2.noarch.rpm"
RPM_HASH = "344c6ac48f49b20495e6cfe3f54b83c10f33f26aa7697d5fc418cd652346e04cdb34df8e83bda6657526d43626da65101b5d12c973beb569fa74ba59750e6ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-watchdog-doc python310-watchdog-doc"
RDEPENDS:${PN} += ""

inherit rpm
