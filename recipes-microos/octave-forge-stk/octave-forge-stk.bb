SUMMARY = "Small Octave Toolbox for Kriging"
DESCRIPTION = "The STK is a (not so) Small Toolbox for Kriging. Its primary focus \
in on the interpolation/regression technique known as kriging, which \
is very closely related to Splines and Radial Basis Functions, and can be \
interpreted as a non-parametric Bayesian method using a Gaussian Process \
(GP) prior. The STK also provides tools for the sequential and \
non-sequential design of experiments. Even though it is, currently, mostly \
geared towards the Design and Analysis of Computer Experiments (DACE), the \
STK can be useful for other applications areas (such as Geostatistics, \
Machine Learning, Non-parametric Regression, etc.). \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "octave-forge-stk-2.8.0-1.2.aarch64.rpm"
RPM_HASH = "00578ffb8fd5c9a4c0881627197fda6775775e959b64f1b7901b7ba7934a8fab0e76a2743e186ae5627afa924b16f490ed372424da8447a725d153756a71b55f"

RPROVIDES:${PN} += "octave-forge-stk octave-forge-stk(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) octave-cli"

inherit rpm
