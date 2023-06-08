SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "python311-octave-kernel-0.35.1-1.3.noarch.rpm"
RPM_HASH = "283f7a02eb829576439e36e61339291e1074022fdbd0536b9f2295b7a931d2d6da1e0e8679b6c1d2a98c64869095b20e1fc7cb15f0741c286e63396d4d743bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(octave-kernel) python311-jupyter_octave_kernel python311-octave-kernel python3dist(octave-kernel)"
RDEPENDS:${PN} += "jupyter-octave-kernel python(abi) python311-ipykernel python311-jupyter-client python311-metakernel"

inherit rpm
