SUMMARY = "Python extensions for O2scl"
DESCRIPTION = "A high-level plotting script, o2graph, for quick matplotlib or yt plots for use \
with the O2scl C++ library and a set of python classes for convenient plotting."
LICENSE = "GPL-3.0-only"

PV = "0.926"

RPM_NAME = "python311-o2sclpy-0.926-1.4.noarch.rpm"
RPM_HASH = "44bff41ab5ba5b5e23b6db0affbf8db19d400c321209d2ffb4fb910c2ab455bcfec65e43c314af0b964dda3f6b8f8038806e7c82f90cf45856f0b8dd4a63ee88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(o2sclpy) python311-o2sclpy python3dist(o2sclpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 o2scl-devel python(abi) python311-h5py python311-matplotlib python311-numpy python311-requests texlive-latex update-alternatives"

inherit rpm
