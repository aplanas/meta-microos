SUMMARY = "Read and write ImageJ ROI format"
DESCRIPTION = "Roifile is a Python library to read, write, create, and plot ImageJ ROIs, \
an undocumented and ImageJ application specific format to store regions \
of interest, geometric shapes, paths, text, and whatnot for image \
overlays."
LICENSE = "BSD-3-Clause"

PV = "2020.11.28"

RPM_NAME = "python310-roifile-2020.11.28-1.8.noarch.rpm"
RPM_HASH = "0863317cfadaeceec5080523a1ff309a6c962773a5fedfe957ec13300d681ae67d22fa53abdc855230e3c8fce5975d5052fd5c85b28a03c3001faa0657339864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-roifile python3.10dist(roifile) python310-roifile python3dist(roifile)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-matplotlib python310-numpy python310-tifffile update-alternatives"

inherit rpm
