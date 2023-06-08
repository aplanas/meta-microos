SUMMARY = "Sphinx extension that automatically documents click applications"
DESCRIPTION = "A Sphinx plugin that allows to automatically extract documentation from click-based applications and include it in documentation."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python310-sphinx-click-4.4.0-1.3.noarch.rpm"
RPM_HASH = "4667498b19ce03bb94dde35b1ac72b4ebc2a3d06d229b8bff7be82b6e4b51559da01f5fc30e513bc0befba7ed9098c41c700dc55c0099a6bef9521413f2550f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-click python3.10dist(sphinx-click) python310-sphinx-click python3dist(sphinx-click)"
RDEPENDS:${PN} += "python(abi) python3.10dist(click) python3.10dist(docutils) python3.10dist(sphinx)"

inherit rpm
