SUMMARY = "DSP and Comm package for Python"
DESCRIPTION = "This package is a collection of functions and classes to support \
signal processing and communications theory teaching and research. \
The foundation for this package is scipy.signal."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python311-scikit-dsp-comm-1.2.0-3.8.noarch.rpm"
RPM_HASH = "bc555024197a36615b1e67e02664f0b5f702e626dbb3bcfec67d7eba4823f4ed06f89e9bfe7f4e8050a5de827a008785534580f0001c391604e86453e9346a4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(scikit-dsp-comm) python311-scikit-dsp-comm python3dist(scikit-dsp-comm)"
RDEPENDS:${PN} += "python(abi) python311-matplotlib python311-numpy python311-scipy"

inherit rpm
