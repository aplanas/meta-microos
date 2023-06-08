SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.6.1"

RPM_NAME = "python39-setuptools-wheel-67.6.1-1.1.noarch.rpm"
RPM_HASH = "e4dfa193762b3cb28794a143b6cab181d96958735b69b1b20cb8b90b1d0d5aa89135cd8477017b4239fd5a3ecc58e2e31e8ed731cacbdf758f6760f4c10985c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-setuptools-wheel"
RDEPENDS:${PN} += "python(abi) update-alternatives"

inherit rpm
