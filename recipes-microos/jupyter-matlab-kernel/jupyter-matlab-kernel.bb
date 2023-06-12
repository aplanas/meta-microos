SUMMARY = "Matlab kernel for Jupyter"
DESCRIPTION = "A Matlab kernel for Jupyter. The Matlab kernel is based on \
MetaKernel, which means it features a standard set of magics."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.17.1"

RPM_NAME = "jupyter-matlab-kernel-0.17.1-1.2.noarch.rpm"
RPM_HASH = "672be3d8ab1ae65d83ed38e95632c587c92b8ffa80d576eb8bfcd03329c1ceb82a2fdac2dcbea00a34da6a1dbf98e9c446b625e85a297d480afba631c111ad71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-matlab-kernel \
python3-jupyter_matlab_kernel \
python3-matlab-kernel \
python3.10dist(matlab-kernel) \
python3dist(matlab-kernel)"
RDEPENDS:${PN} += "python(abi) \
python3-ipython \
python3-jupyter_client \
python3-metakernel"

inherit rpm
