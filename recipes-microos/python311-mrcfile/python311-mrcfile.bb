SUMMARY = "MRC file I/O library"
DESCRIPTION = "A Python implementation of the MRC2014 file format, which \
is used in structural biology to store image and volume data."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "python311-mrcfile-1.4.3-2.1.noarch.rpm"
RPM_HASH = "19a3d37e5aa5516f078d1c5b382c5ddaa76b6a1fbe0f13781b436a1cd8f53cf3e858889a1029c4549737a2751814164b8d6c217c35e23f7ccff1a18b0d0ff607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mrcfile) \
python311-mrcfile \
python3dist(mrcfile)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-numpy \
update-alternatives"

inherit rpm
