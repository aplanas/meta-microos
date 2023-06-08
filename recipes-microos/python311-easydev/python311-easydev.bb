SUMMARY = "Common utilities to ease the development of Python packages"
DESCRIPTION = "The easydev package  provides miscellaneous functions that are \
repeatedly used during the development of Python packages. The goal \
is to help developers on speeding up their own dev. It has been used \
also as an incubator for other packages and is stable."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python311-easydev-0.12.1-2.2.noarch.rpm"
RPM_HASH = "4361bc840f3c742299e85d8fa521639c8b3d47e27bd93e81972192bb73dacafed6fe434fe8fbdb77e65842609161efaa27cd2d43df609b44940481d366f8aada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(easydev) python311-easydev python3dist(easydev)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-colorama python311-colorlog python311-pexpect python311-setuptools update-alternatives"

inherit rpm
