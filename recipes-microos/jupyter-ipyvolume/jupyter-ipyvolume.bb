SUMMARY = "IPython widget for rendering 3d volumes"
DESCRIPTION = "3d plotting for Python in the Jupyter notebook based on IPython widgets using WebGL. \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "jupyter-ipyvolume-0.6.1-1.2.noarch.rpm"
RPM_HASH = "ef387909feb16dbdbd3e6524487920fc215668370f8bbb207cf1decfedbccf9a9277363b5f8198d80ecf7dc5ba38262d60a525d43ae435101854ce69c5731e00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvolume"
RDEPENDS:${PN} += "jupyter-ipywebrtc jupyter-ipywidgets jupyter-notebook jupyter-pythreejs python3dist(ipyvolume)"

inherit rpm
