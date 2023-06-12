SUMMARY = "DSP and Comm package for Python"
DESCRIPTION = "This package is a collection of functions and classes to support \
signal processing and communications theory teaching and research. \
The foundation for this package is scipy.signal."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python310-scikit-dsp-comm-1.2.0-3.8.noarch.rpm"
RPM_HASH = "5a005fa298ef253d72b719ddc84f7a67b43c4d86a4b5e3886fd657af1d2b0236b022caa5c971ca14d3451c0ed74652bb24c7f9dbc454a529c3675d5d4144f8e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-dsp-comm \
python3.10dist(scikit-dsp-comm) \
python310-scikit-dsp-comm \
python3dist(scikit-dsp-comm)"
RDEPENDS:${PN} += "python(abi) \
python310-matplotlib \
python310-numpy \
python310-scipy"

inherit rpm
