SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python39-PeakUtils-1.3.4-1.1.noarch.rpm"
RPM_HASH = "d7a193c2da1abe78f354bad7140b52dcd153a84118db5d5f2c370fedf9443a62b65d1d0d24ae3fb5db3b9ac5c38cb1808d109ed41906395126fd7dfb4042fa05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(peakutils) python39-PeakUtils python3dist(peakutils)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-scipy"

inherit rpm
