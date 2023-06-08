SUMMARY = "DSP and Comm package for Python"
DESCRIPTION = "This package is a collection of functions and classes to support \
signal processing and communications theory teaching and research. \
The foundation for this package is scipy.signal."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python39-scikit-dsp-comm-1.2.0-3.8.noarch.rpm"
RPM_HASH = "d2d3645bdfa8b5284c8d439a577bb553f540720eb6020c0c2d835536d68018246da8258ccfe9cf81c4910aa20bef43a1f4b8f99198c2714b9dbc075bb84a1269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(scikit-dsp-comm) python39-scikit-dsp-comm python3dist(scikit-dsp-comm)"
RDEPENDS:${PN} += "python(abi) python39-matplotlib python39-numpy python39-scipy"

inherit rpm
