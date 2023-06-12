SUMMARY = "Peak detection utilities for 1D data"
DESCRIPTION = "This package provides utilities related to the detection of peaks on \
1D data. Includes functions to estimate baselines, finding the \
indexes of peaks in the data and performing Gaussian fitting or \
centroid computation to further increase the resolution of the peak \
detection."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python311-PeakUtils-1.3.4-1.1.noarch.rpm"
RPM_HASH = "3494add191b7d36918692cb61f2a25afb3bb11cf222e2f4f8f100b01eb368c8eb2195d8a793c469eb03287370f14d43a39be627846cd58d939bb7f71edc47990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(peakutils) \
python311-PeakUtils \
python3dist(peakutils)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-scipy"

inherit rpm
