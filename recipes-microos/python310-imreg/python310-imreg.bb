SUMMARY = "FFT based image registration"
DESCRIPTION = "Imreg is a Python library that implements an FFT-based technique for \
translation, rotation and scale-invariant image registration."
LICENSE = "BSD-3-Clause"

PV = "2020.1.1"

RPM_NAME = "python310-imreg-2020.1.1-2.9.noarch.rpm"
RPM_HASH = "b109801d5fabdc54eb4ace415d9ef7fb1f7075d6c2455c4805a99fb1007f9c3ddf81fcb3a43d5632351d04a6fcf94fe2852956a4b8e2d43e011a99d938adf3ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imreg python3.10dist(imreg) python310-imreg python3dist(imreg)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-scipy"

inherit rpm
