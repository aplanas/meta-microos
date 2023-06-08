SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-ipywebrtc-0.6.0-1.16.noarch.rpm"
RPM_HASH = "7301f7d11af45b6a04115ef13ed5abf525a4a52607a3b8335fbf54f208cea9d96a32a4736e55245a5684898eb18b0ea12a262052c9d08af41007dc52a20b055f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ipywebrtc) python311-ipywebrtc python3dist(ipywebrtc)"
RDEPENDS:${PN} += "jupyter-ipywebrtc python(abi) python311-ipywidgets"

inherit rpm
