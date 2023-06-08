SUMMARY = "IPython widget for rendering 3d volumes"
DESCRIPTION = "3d plotting for Python in the Jupyter notebook based on IPython widgets using WebGL. \
 \
This package provides the jupyterlab extension."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "jupyter-jupyterlab-ipyvolume-0.6.1-1.2.noarch.rpm"
RPM_HASH = "9eaa91c4c8d6bf3c7a8be4465e174d0f2f9e6bef8a640373808576f8f681f94f5bd3e3c8bbe906ca73aedc85475cd13ae72a82238b38caa279099d8b42257ca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-jupyterlab-ipyvolume"
RDEPENDS:${PN} += "jupyter-ipywebrtc jupyter-ipywidgets jupyter-jupyterlab jupyter-pythreejs python3dist(ipyvolume)"

inherit rpm
