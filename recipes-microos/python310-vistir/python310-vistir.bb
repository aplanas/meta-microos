SUMMARY = "Utilities for filesystems, paths, projects, subprocesses, and more"
DESCRIPTION = "Miscellaneous utilities for dealing with filesystems, paths, projects, \
subprocesses, and more."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "python310-vistir-0.7.0-1.3.noarch.rpm"
RPM_HASH = "6f62c2c27591f4c6a392b13e169f61a3499db1befcbee1e3362bea4ae12732c6bce03a37d61354b33c56a66e5a160667838b47adb6a22f2e60180b7c659c459b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vistir python3.10dist(vistir) python310-vistir python3dist(vistir)"
RDEPENDS:${PN} += "python(abi) python310-colorama"

inherit rpm
