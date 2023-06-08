SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.6.1"

RPM_NAME = "python311-setuptools-wheel-67.6.1-1.1.noarch.rpm"
RPM_HASH = "8f7defaa0fde7a6488715ad9c48c42459fd9bba893e615e7bf038b4d76f1eaaabf102f5a62feb681437783e9f89c5fe567dd66d7887d806454fb9a23b0389512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-setuptools-wheel"
RDEPENDS:${PN} += "python(abi) update-alternatives"

inherit rpm
