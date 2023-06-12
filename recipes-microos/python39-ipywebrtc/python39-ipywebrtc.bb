SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-ipywebrtc-0.6.0-1.17.noarch.rpm"
RPM_HASH = "b6f52c974b9c331c25f23db864367e05711f74e9938f9e2d6c01a6f840dadfe5a5b049591cb1842e2185d9f4832d0f50ccbde54f4eeab3c14f953460ac33cb88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ipywebrtc) python39-ipywebrtc python3dist(ipywebrtc)"
RDEPENDS:${PN} += "jupyter-ipywebrtc python(abi) python39-ipywidgets"

inherit rpm
