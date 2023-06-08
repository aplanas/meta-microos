SUMMARY = "Utilities not included with the standard Python install"
DESCRIPTION = "Python Utils is a collection of Python functions and \
classes which make common patterns shorter and easier."
LICENSE = "BSD-3-Clause"

PV = "3.4.5"

RPM_NAME = "python310-python-utils-3.4.5-1.3.noarch.rpm"
RPM_HASH = "ee990d6bdb2f641d7b162c4d014e54c19b344f6d07c9db540dadc35015b9a2ed1eb685daf1133d75a07a18b13313205c0d5aa986e9125b04213f7ee677b974d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-utils python3.10dist(python-utils) python310-python-utils python3dist(python-utils)"
RDEPENDS:${PN} += "python(abi) python310-loguru"

inherit rpm
