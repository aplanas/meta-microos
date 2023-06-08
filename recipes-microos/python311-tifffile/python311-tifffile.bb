SUMMARY = "Read and write TIFF(r) files"
DESCRIPTION = "Read and write TIFF(r) files. Read image and metadata from many \
bio-scientific formats such as plain TIFF, BigTIFF, OME-TIFF, STK, LSM, \
SGI, NIH, ImageJ, MicroManager, MD GEL, and FluoView files. Write numpy \
arrays to TIFF, BigTIFF, and ImageJ hyperstack compatible files."
LICENSE = "BSD-2-Clause"

PV = "2023.3.15"

RPM_NAME = "python311-tifffile-2023.3.15-1.1.noarch.rpm"
RPM_HASH = "7ea4192e1a4075a71e8812d736b768127fb4cd41f27ac8256f96ce01208e9a6af9db3e641a8aa7c6b79c98a282eef6f05d19e008b3f5b492b1540c674adfb86f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tifffile) python311-tifffile python3dist(tifffile)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-numpy update-alternatives"

inherit rpm
