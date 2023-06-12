SUMMARY = "A Jupyter kernel for Octave"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the python interface."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "python310-octave-kernel-0.35.1-1.3.noarch.rpm"
RPM_HASH = "413baf4d08d1fb22790f8cb52e717a8389b41c7e38f448d2e143729980d4895b4801f70b16279a513d7a4c4131b3b08bf10bf9dabbf7bf5b01b8ba86ebcd2169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter_octave_kernel \
python3-octave-kernel \
python3.10dist(octave-kernel) \
python310-jupyter_octave_kernel \
python310-octave-kernel \
python3dist(octave-kernel)"
RDEPENDS:${PN} += "jupyter-octave-kernel \
python(abi) \
python310-ipykernel \
python310-jupyter-client \
python310-metakernel"

inherit rpm
