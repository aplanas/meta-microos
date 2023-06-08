SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-ipywebrtc-0.6.0-1.16.noarch.rpm"
RPM_HASH = "6c5e3521b557f6c97f05bd1289f2c4cccd82645a107b53c0f1388ce51d05da754a21a6946880f55878097ed30807dcda9418b552c9f9b6c51aae6c86d6eda22d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipywebrtc) python39-ipywebrtc python3dist(ipywebrtc)"
RDEPENDS:${PN} += "jupyter-ipywebrtc python(abi) python39-ipywidgets"

inherit rpm
