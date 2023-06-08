SUMMARY = "GENeralized Fourier Iterative REconstruction"
DESCRIPTION = "GENeralized Fourier Iterative REconstruction (GENFIRE) \
is a python package for 3D reconstruction from arbitrarily \
oriented projection images"
LICENSE = "GPL-3.0-only"

PV = "1.1.11"

RPM_NAME = "python311-genfire-1.1.11-5.4.noarch.rpm"
RPM_HASH = "e04f4b61dc4353805527f8f2d6606bbe04378608c3d34092ed76805fc0c8f3d2d5e0accccc76bfa3fb480ab593fcfc7e8c92cad9c13b6de5f24166870e818716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(genfire) python311-genfire python3dist(genfire)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Pillow python311-PyQt5 python311-numpy python311-pyFFTW python311-pyparsing python311-scipy python311-setuptools update-alternatives"

inherit rpm
