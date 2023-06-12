SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.7.2"

RPM_NAME = "python311-setuptools-67.7.2-1.1.noarch.rpm"
RPM_HASH = "f037a2f707e5a46423ac75067bacce446b90b60b908fce8d542893b7359c9fc8d366c70e2c1db12ac48710733e2be285856b468226681a73f821e021adae89d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools) \
python311-setuptools \
python3dist(setuptools)"
RDEPENDS:${PN} += "python(abi) \
update-alternatives"

inherit rpm
