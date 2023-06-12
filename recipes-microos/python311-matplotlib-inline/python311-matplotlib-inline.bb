SUMMARY = "Inline Matplotlib backend for Jupyter"
DESCRIPTION = "Matplotlib Inline Back-end for IPython and Jupyter"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python311-matplotlib-inline-0.1.6-1.3.noarch.rpm"
RPM_HASH = "62868b869dd39cff8695f5397d9052ef9b708b05be554fb1e22b6d748d4cd29bbcad55d069a9f29b09c5218d8864ecbbe6b38ffe72c1a9032f3b94294ba51974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(matplotlib-inline) \
python311-matplotlib-inline \
python3dist(matplotlib-inline)"
RDEPENDS:${PN} += "python(abi) \
python311-traitlets"

inherit rpm
