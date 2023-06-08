SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.6.1"

RPM_NAME = "python310-setuptools-67.6.1-1.1.noarch.rpm"
RPM_HASH = "54db83aa2a47f20c00f39a5b3a7120ed9908e114a7cc04bec39525e23f7351fabdcd7bfaf5370c80d831a7e7a9fb8f82563543150028cd8fb39e6717010f5621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools python3.10dist(setuptools) python310-setuptools python3dist(setuptools)"
RDEPENDS:${PN} += "python(abi) update-alternatives"

inherit rpm
