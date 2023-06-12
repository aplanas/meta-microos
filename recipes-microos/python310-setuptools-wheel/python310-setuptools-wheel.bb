SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.7.2"

RPM_NAME = "python310-setuptools-wheel-67.7.2-1.1.noarch.rpm"
RPM_HASH = "b7d7eb75d00333a133f185f30b6d15a6cb600791738ad20c63fca008744cd3071ba0c2aed6113885d8873fad966ea684ba283362b56fa24796ef74f2e173e635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-wheel python310-setuptools-wheel"
RDEPENDS:${PN} += "python(abi) update-alternatives"

inherit rpm
