SUMMARY = "Queueing Networks and Markov chains analysis for Octave"
DESCRIPTION = "Functions for queueing networks and Markov chains analysis. \
This package can be used to compute steady-state performance measures \
for open, closed and mixed networks with single or multiple job classes. \
Mean Value Analysis (MVA), convolution, and various bounding techniques are \
implemented. Furthermore, several transient and steady-state performance \
measures for Markov chains can be computed, such as state occupancy \
probabilities, mean time to absorption, time-averaged sojourn times \
and so forth. Discrete- and continuous-time Markov chains are supported. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "octave-forge-queueing-1.2.7-1.11.noarch.rpm"
RPM_HASH = "59d554115b105ee29b6707130a1509718310f54936b879bcf25b2c939f4eedc45e9ea832761a9daf22ad03ba3b78c800b0c7d816f4c7c79bb93d0da4b41f0c86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-queueing"
RDEPENDS:${PN} += "/bin/sh octave-cli"

inherit rpm
