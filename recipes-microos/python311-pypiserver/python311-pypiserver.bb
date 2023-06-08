SUMMARY = "Minimal PyPI server for uploading & downloading packages with pip/easy_install"
DESCRIPTION = "Minimal PyPI server for uploading & downloading packagesj with pip/easy_install"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-pypiserver-1.5.1-1.5.noarch.rpm"
RPM_HASH = "16ae21803300a97f7a26369694192b96d1445c40a87047130da79d53931593870ff8fcdad6c620c20578ef0907ef998a1d5d9af3b8c46d4d060def70119634c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pypiserver) python311-pypiserver python3dist(pypiserver)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-passlib python311-setuptools update-alternatives"

inherit rpm
