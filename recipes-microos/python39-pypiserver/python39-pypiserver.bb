SUMMARY = "Minimal PyPI server for uploading & downloading packages with pip/easy_install"
DESCRIPTION = "Minimal PyPI server for uploading & downloading packagesj with pip/easy_install"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-pypiserver-1.5.1-1.5.noarch.rpm"
RPM_HASH = "581bd7392ddca4c93cc002863452f15067deee0ccbce3ee5e9be85298e0577497a68f4de6b48c125ecbc610a7d81f9dd2400fa7ff90cf62f72f7a802ea90c39a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pypiserver) python39-pypiserver python3dist(pypiserver)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-passlib python39-setuptools update-alternatives"

inherit rpm
