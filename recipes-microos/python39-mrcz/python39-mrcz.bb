SUMMARY = "MRCZ meta-compressed image file-format library"
DESCRIPTION = "mrcz is a package designed to supplement the venerable MRC image file \
format with a highly efficient compressed variant, using the blosc \
meta-compressor library to shrink files on disk and greatly accelerate \
file input/output for the era of 'Big Data' in electron and optical \
microscopy."
LICENSE = "BSD-3-Clause"

PV = "0.5.6"

RPM_NAME = "python39-mrcz-0.5.6-2.7.noarch.rpm"
RPM_HASH = "46557d4d39f6eebcebda8d5683beb960f636e0493f70f049791a5de9a5556d1128466b41690bca568b6929aba96df8cdd91d2dbaa266c946e8bffb8703f90c58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mrcz) python39-mrcz python3dist(mrcz)"
RDEPENDS:${PN} += "python(abi) python39-blosc python39-numpy"

inherit rpm
