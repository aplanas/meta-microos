SUMMARY = "Read and write TIFF files"
DESCRIPTION = "Read and write TIFF files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.4.12"

RPM_NAME = "python311-tifffile-2023.4.12-1.1.noarch.rpm"
RPM_HASH = "9acb261f07ee01c4b781ad588ed5bdcd2d35cb4e2d5100d5eb4d89aa81051e5899460bbef6e908c72e84f7448014fe6c85a7d20c0231fcfdcc78321952186318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tifffile) python311-tifffile python3dist(tifffile)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-numpy update-alternatives"

inherit rpm
