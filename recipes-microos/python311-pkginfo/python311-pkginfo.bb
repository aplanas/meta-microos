SUMMARY = "Python package for querying metadatdata from sdists/bdists/installed packages"
DESCRIPTION = "This package provides an API for querying the distutils metadata written in \
the PKG-INFO file inside a source distriubtion (an sdist) or a \
binary distribution (e.g., created by running bdist_egg).  It can \
also query the EGG-INFO directory of an installed distribution, and \
the *.egg-info stored in a 'development checkout' \
(e.g, created by running setup.py develop)."
LICENSE = "MIT"

PV = "1.9.6"

RPM_NAME = "python311-pkginfo-1.9.6-2.1.noarch.rpm"
RPM_HASH = "59c23131add4db8a07d2ce3743344fb2d6c674cdb457ec5a76515595a8399c6b67d134d9ce3ec3f36e3e2be8396cf8f37e4c80382f83c9c6fbd0edea5f7772be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pkginfo) python311-pkginfo python3dist(pkginfo)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-setuptools update-alternatives"

inherit rpm
