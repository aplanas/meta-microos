SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "python39-PeakUtils-1.3.3-2.7.noarch.rpm"
RPM_HASH = "093f9b0dae2930ce66637e719876ce227dc624a00489ab9bcd99c70cda785416e8289f6f6793d8450bbdefb6eac5a8925dc7dbc8cd53152a561d5ac83513fcc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(peakutils) python39-PeakUtils python3dist(peakutils)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-scipy"

inherit rpm
