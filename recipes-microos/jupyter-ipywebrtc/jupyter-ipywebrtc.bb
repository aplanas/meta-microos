SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the jupyter notebook and jupyterlab \
extensions."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "jupyter-ipywebrtc-0.6.0-1.16.noarch.rpm"
RPM_HASH = "d3a3b35e33d7a7864ee99ac06eb29695fa091584376165dbfdcd190dd23de10b830667b61626a0bb26ece31e49a455a9699c52dc659d6c2de569ce15b1fd665c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(jupyter-ipywebrtc) jupyter-ipywebrtc"
RDEPENDS:${PN} += "jupyter-ipywidgets jupyter-jupyterlab jupyter-notebook python3-ipywebrtc"

inherit rpm
