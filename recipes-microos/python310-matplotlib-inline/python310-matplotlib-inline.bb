SUMMARY = "Inline Matplotlib backend for Jupyter"
DESCRIPTION = "Matplotlib Inline Back-end for IPython and Jupyter"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python310-matplotlib-inline-0.1.6-1.3.noarch.rpm"
RPM_HASH = "16a2847aca0b0d8319dada0c6312e561976e387b8814d0b22ddf324fdf4206886550fa28e047490fc8ac836cb339076c9eb8147edf8d0f780a6a0de7823a677c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matplotlib-inline \
python3.10dist(matplotlib-inline) \
python310-matplotlib-inline \
python3dist(matplotlib-inline)"
RDEPENDS:${PN} += "python(abi) \
python310-traitlets"

inherit rpm
