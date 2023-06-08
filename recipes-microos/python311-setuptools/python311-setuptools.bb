SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.6.1"

RPM_NAME = "python311-setuptools-67.6.1-1.1.noarch.rpm"
RPM_HASH = "1dbf403faa8ee4661494e709ec143d83f561c7b29a62ce813b35a9d6b6209ae65c2574c5325802a8a6210c73eec30c02d123223bf6d6cb91a6b946a0199cf820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools) python311-setuptools python3dist(setuptools)"
RDEPENDS:${PN} += "python(abi) update-alternatives"

inherit rpm
