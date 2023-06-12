SUMMARY = "Structured Similarity Image Metric (SSIM)"
DESCRIPTION = "Module for computing Structured Similarity Image Metric (SSIM) in Python."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python311-pyssim-0.5-1.2.noarch.rpm"
RPM_HASH = "18508db22132a78b7731c88178f39986473f00f3d1cd7eb3f4998ecfccf1058822d598463a54b9428f743041980e7cd386b9b248ef13f29b1933d1be40ffb45a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyssim) \
python311-pyssim \
python3dist(pyssim)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Pillow \
python311-numpy \
python311-scipy \
update-alternatives"

inherit rpm
