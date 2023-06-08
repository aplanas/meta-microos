SUMMARY = "Minimal PyPI server for uploading & downloading packages with pip/easy_install"
DESCRIPTION = "Minimal PyPI server for uploading & downloading packagesj with pip/easy_install"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-pypiserver-1.5.1-1.5.noarch.rpm"
RPM_HASH = "aa86e830f5b83ea88add0787aeeb74b56bda6e7472efb32765c2b8c894a6830213a226a65a37dabf9e5b6a831fe20a2ee75e3be43f32fa07d2ba3074da9d1bbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypiserver python3.10dist(pypiserver) python310-pypiserver python3dist(pypiserver)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-passlib python310-setuptools update-alternatives"

inherit rpm
