SUMMARY = "Utilities for filesystems, paths, projects, subprocesses, and more"
DESCRIPTION = "Miscellaneous utilities for dealing with filesystems, paths, projects, \
subprocesses, and more."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "python39-vistir-0.7.0-1.3.noarch.rpm"
RPM_HASH = "0113d17e2154d1d503b269eecc815030dfca85131e6e66e7dd8844190ec0adc8b026f9b235a59565b1dc4772d0147480531eb813d36323900e69873586db3a5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vistir) python39-vistir python3dist(vistir)"
RDEPENDS:${PN} += "python(abi) python39-colorama"

inherit rpm
