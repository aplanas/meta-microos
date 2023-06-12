SUMMARY = "Read and write TIFF files"
DESCRIPTION = "Read and write TIFF files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.4.12"

RPM_NAME = "python39-tifffile-2023.4.12-1.1.noarch.rpm"
RPM_HASH = "5ab578f1ca42ab5dd1dc14a77094823134ff53da9e5b968e4faa9fcd6453dda565074cc850b3a00f9561bc2743c0a57838cedf09401f7dbc5331c32b14b4083a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tifffile) python39-tifffile python3dist(tifffile)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-numpy update-alternatives"

inherit rpm
