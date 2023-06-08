SUMMARY = "Python library for reading and writing image, video, and related formats"
DESCRIPTION = "Imageio is a Python library that provides an interface to read and \
write a wide range of image data, including animated images, volumetric \
data, and scientific formats."
LICENSE = "BSD-2-Clause"

PV = "2.21.2"

RPM_NAME = "python311-imageio-2.21.2-1.4.noarch.rpm"
RPM_HASH = "04d68f1205d43e1d2240b44704ecf737d170d4b7d420758b22a6f7641689c8cf24c31e27a5a0af514701cb0721da7919df978db611292fbd5a42a9b648dcb905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(imageio) python311-imageio python3dist(imageio)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Pillow python311-numpy update-alternatives"

inherit rpm
