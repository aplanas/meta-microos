SUMMARY = "Interactive plotting package for the Jupyter notebook"
DESCRIPTION = "A kernel to allow Octave to be used in Jupyter. \
 \
This package provides the jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "0.35.1"

RPM_NAME = "jupyter-octave-kernel-0.35.1-1.3.noarch.rpm"
RPM_HASH = "9a0c0eb5ed92116a8a44f770bc9f3e8b30fecbb276c5f803d5bb2d192338f407a9a24f1a7916c23a5d182a8444fe4f2df3ad4e405c705c891e91a0677f1580ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-octave-kernel jupyter-octave_kernel"
RDEPENDS:${PN} += "jupyter-notebook python3-octave-kernel"

inherit rpm
