SUMMARY = "Collection of Python utilities for signal analysis"
DESCRIPTION = "The thLib package contains functions for working with sound, and for \
fitting circles, lines, sine-waves, and exponential decays. For \
signal processing, a Savitzky-Golay filter is included, as well as a \
demonstration of the calculation of a power spectrum. UI utilities, \
and a few useful vector functions (e.g. an implementation of the\\ \
Savitzky-Golay algorithm) round off thLib. \
 \
Note: All functions for working with 3D kinematics have been moved into \
the new package 'scikit-kinematics'!"
LICENSE = "BSD-2-Clause"

PV = "0.12.2"

RPM_NAME = "python311-thLib-0.12.2-5.8.noarch.rpm"
RPM_HASH = "834f476ab47f9dacce29d27860adc30748c2b6a86cba1c06c58c0cf16556d54ed8dfd76da8fa80efaafeed2deffb0948721711a648d3efdb95f7722d5eb00280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(thlib) python311-thLib python3dist(thlib)"
RDEPENDS:${PN} += "python(abi) python311-matplotlib python311-numpy python311-pandas python311-scikit-image python311-scipy python311-statsmodels python311-sympy"

inherit rpm
