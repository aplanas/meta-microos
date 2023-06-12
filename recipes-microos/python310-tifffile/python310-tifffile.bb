SUMMARY = "Read and write TIFF files"
DESCRIPTION = "Read and write TIFF files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.4.12"

RPM_NAME = "python310-tifffile-2023.4.12-1.1.noarch.rpm"
RPM_HASH = "7bd24bca423fdf4ad6eb0ee3453afbca86ec1a223bff301f5e65ec6261de19e50b5619e2e1575d4fad26e83e996186f0db2b703c59d94f149822bde9990b568c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tifffile \
python3.10dist(tifffile) \
python310-tifffile \
python3dist(tifffile)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-numpy \
update-alternatives"

inherit rpm
