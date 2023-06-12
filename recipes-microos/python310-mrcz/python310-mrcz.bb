SUMMARY = "MRCZ meta-compressed image file-format library"
DESCRIPTION = "mrcz is a package designed to supplement the venerable MRC image file \
format with a highly efficient compressed variant, using the blosc \
meta-compressor library to shrink files on disk and greatly accelerate \
file input/output for the era of 'Big Data' in electron and optical \
microscopy."
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python310-mrcz-0.5.6-2.7.noarch.rpm"
RPM_HASH = "b8f9ae3e6b7da88bb2a6e2b1f079feea9f9d6d7ee353c2db7dcfef9b3a1f6585e17a305b03dd18df7badfde822fb92e79d01fe6918bf8fa09eb9fdbc274e8140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mrcz \
python3.10dist(mrcz) \
python310-mrcz \
python3dist(mrcz)"
RDEPENDS:${PN} += "python(abi) \
python310-blosc \
python310-numpy"

inherit rpm
