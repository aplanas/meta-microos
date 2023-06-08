SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-ipywebrtc-0.6.0-1.16.noarch.rpm"
RPM_HASH = "8e2f93548152841f3a967a0d713604c7a9f58a225859585b17c43743c2c1e7b878a438f8177626280893d0e62361d8aa806f8b0eacdd168a43c1745bf9561de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipywebrtc python3.10dist(ipywebrtc) python310-ipywebrtc python3dist(ipywebrtc)"
RDEPENDS:${PN} += "jupyter-ipywebrtc python(abi) python310-ipywidgets"

inherit rpm
