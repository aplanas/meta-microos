SUMMARY = "Download, build, install, upgrade, and uninstall Python packages"
DESCRIPTION = "setuptools is a collection of enhancements to the Python distutils that \
allow you to build and distribute Python packages, \
especially ones that have dependencies on other packages."
LICENSE = "Apache-2.0 & MIT & BSD-2-Clause & Python-2.0"

PV = "67.6.1"

RPM_NAME = "python310-setuptools-wheel-67.6.1-1.1.noarch.rpm"
RPM_HASH = "d07e732a250afd551b93f5cdea5268027a034fc031c75d7119a0addd799e0c04a50a5cd55aaaafb74af66c4e02f34c3824bf8bc12e38f8aed7bff9e2754aab57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-wheel python310-setuptools-wheel"
RDEPENDS:${PN} += "python(abi) update-alternatives"

inherit rpm
