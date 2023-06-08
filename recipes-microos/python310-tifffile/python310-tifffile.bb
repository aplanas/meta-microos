SUMMARY = "Read and write TIFF(r) files"
DESCRIPTION = "Read and write TIFF(r) files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.3.15"

RPM_NAME = "python310-tifffile-2023.3.15-1.1.noarch.rpm"
RPM_HASH = "680872e319b740fd5aa61e0fa9be31352593b839665709fd060915bc160b85e0fe327cc6621f70831c29ff29e05511a693cd6f27d3af96803c2b21e4cd018514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tifffile python3.10dist(tifffile) python310-tifffile python3dist(tifffile)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-numpy update-alternatives"

inherit rpm
