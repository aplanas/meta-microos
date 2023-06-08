SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python311-pythreejs-2.4.1-7.8.noarch.rpm"
RPM_HASH = "c83a67831039c49827903658a66ac500439d5a349425e509245c053c54f9282d14ee10c4c131791188d97ce3417920f38298db1b59fe76061804715422c2554b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pythreejs) python311-pythreejs python3dist(pythreejs)"
RDEPENDS:${PN} += "jupyter-threejs python(abi) python311-ipydatawidgets python311-ipywidgets python311-numpy python311-traitlets"

inherit rpm
