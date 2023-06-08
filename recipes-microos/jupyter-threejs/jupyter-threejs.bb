SUMMARY = "A Python/ThreeJS bridge utilizing the Jupyter widget infrastructure"
DESCRIPTION = "Interactive 3d graphics for the Jupyter notebook, \
using Three.js from Jupyter interactive widgets. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "jupyter-threejs-2.4.0-7.8.noarch.rpm"
RPM_HASH = "72ae9fce2e2e17d76aa1c581f04e50e93b7983808712cd89d8b8437178e05aa6a8a7dff01047fe009885b470c8d9e037262e23684a0ea3a570f0fc0654fae302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-pythreejs jupyter-threejs"
RDEPENDS:${PN} += "jupyter-ipydatawidgets jupyter-ipywidgets jupyter-notebook python3-pythreejs"

inherit rpm
