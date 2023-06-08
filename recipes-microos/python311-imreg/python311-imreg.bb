SUMMARY = "FFT based image registration"
DESCRIPTION = "Imreg is a Python library that implements an FFT-based technique for \
translation, rotation and scale-invariant image registration."
LICENSE = "BSD-3-Clause"

PV = "2020.1.1"

RPM_NAME = "python311-imreg-2020.1.1-2.9.noarch.rpm"
RPM_HASH = "7e386a07d18fb7cebbcf5dc62b8d91cc97a78ba287fe717c5698cb2268cd1dfd9f6fd8ba1b1aafddf03f59f87bdafce371ff0b0e96c655e398b6b7c7d737cff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(imreg) python311-imreg python3dist(imreg)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-scipy"

inherit rpm
