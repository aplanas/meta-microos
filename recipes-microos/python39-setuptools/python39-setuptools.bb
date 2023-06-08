SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.6.1"

RPM_NAME = "python39-setuptools-67.6.1-1.1.noarch.rpm"
RPM_HASH = "185ceb83711a0639f7e385e588a51332464634b71762a6e226021939328bf92d5ccb3d2faba83c3b72ca0653971a39840c5b385795a720c631b2de2d841af1da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(setuptools) python39-setuptools python3dist(setuptools)"
RDEPENDS:${PN} += "python(abi) update-alternatives"

inherit rpm
