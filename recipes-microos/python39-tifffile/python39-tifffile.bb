SUMMARY = "Read and write TIFF(r) files"
DESCRIPTION = "Read and write TIFF(r) files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.3.15"

RPM_NAME = "python39-tifffile-2023.3.15-1.1.noarch.rpm"
RPM_HASH = "bc23ec7a0528e7bb67f9d84559f580d35cbe2b04794f08e44ebd6584c98d7e25db7df9af3dc0f45840e188f590595b242d4489999ebbba8d1504e1d37cb6e2eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tifffile) python39-tifffile python3dist(tifffile)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-numpy update-alternatives"

inherit rpm
