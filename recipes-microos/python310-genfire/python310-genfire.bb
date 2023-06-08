SUMMARY = "GENeralized Fourier Iterative REconstruction"
DESCRIPTION = "GENeralized Fourier Iterative REconstruction (GENFIRE) \
is a python package for 3D reconstruction from arbitrarily \
oriented projection images"
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "python310-genfire-1.1.11-5.4.noarch.rpm"
RPM_HASH = "730fba272813e1f0c157053acaf477fda8783b8d8dc5fbf62d485be4c97f4bf2a6cc2f30112ddb60b817d5d7ca9e6db14f1fc454c95c4eb7fe953b37ea5f4e69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-genfire python3.10dist(genfire) python310-genfire python3dist(genfire)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Pillow python310-PyQt5 python310-numpy python310-pyFFTW python310-pyparsing python310-scipy python310-setuptools update-alternatives"

inherit rpm
