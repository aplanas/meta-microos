SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "python310-PeakUtils-1.3.3-2.7.noarch.rpm"
RPM_HASH = "828750afad3e48af386300d1260efc5b3faca5d2a6417fdbcffc429af7da3dd082b18b47e3c8cba29618984cdcfbe52b03191af0b2e84e8574f7809e1d2f6c96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PeakUtils python3.10dist(peakutils) python310-PeakUtils python3dist(peakutils)"
RDEPENDS:${PN} += "python(abi) python310-numpy python310-scipy"

inherit rpm
