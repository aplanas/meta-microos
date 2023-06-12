SUMMARY = "Read and write ImageJ ROI format"
DESCRIPTION = "Roifile is a Python library to read, write, create, and plot ImageJ ROIs, \
an undocumented and ImageJ application specific format to store regions \
of interest, geometric shapes, paths, text, and whatnot for image \
overlays."
LICENSE = "BSD-3-Clause"

PV = "2020.11.28"

RPM_NAME = "python39-roifile-2020.11.28-1.8.noarch.rpm"
RPM_HASH = "e128cb3c01e1eb2fa914735c57e6f3448925e79802635512fda2b2d7b62e8ded47e8612e69b30516339811459ecb589b6130208e6ec4e9f8b8d513e1555ecd66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(roifile) \
python39-roifile \
python3dist(roifile)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-matplotlib \
python39-numpy \
python39-tifffile \
update-alternatives"

inherit rpm
