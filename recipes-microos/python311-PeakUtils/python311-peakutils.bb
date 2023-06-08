SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "python311-PeakUtils-1.3.3-2.7.noarch.rpm"
RPM_HASH = "a0ef1089b35dd1502de8af92655571fc82fc68ba92dfa76d25b46f5b75b50e553c08faa57ad57a51019b65615aa4bc670bfceedb85cd5a878ffc5a58105631a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(peakutils) python311-PeakUtils python3dist(peakutils)"
RDEPENDS:${PN} += "python(abi) python311-numpy python311-scipy"

inherit rpm
