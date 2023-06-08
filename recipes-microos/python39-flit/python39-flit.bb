SUMMARY = "Simplified packaging of Python modules"
DESCRIPTION = "Simplified packaging of Python modules"
LICENSE = "BSD-3-Clause"

PV = "3.8.0"

RPM_NAME = "python39-flit-3.8.0-4.1.noarch.rpm"
RPM_HASH = "fa8a6be65259daf13d92ab2f4f924776af2c7b873756843ea2dd014dc48d135c0072bee348853e6fc2704c576e4e41dc50e831a64dc654ca536f162bd19af882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flit) python39-flit python3dist(flit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-docutils python39-flit-core python39-requests python39-tomli-w update-alternatives"

inherit rpm
