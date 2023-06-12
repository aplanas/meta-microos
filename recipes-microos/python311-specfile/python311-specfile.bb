SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python311-specfile-0.18.0-1.1.noarch.rpm"
RPM_HASH = "b2666e6eb23850d9dc59b2313df627bb2a8fa13b2584c919b97c00cb0587eb3d1cd60c523df9120fa6224cc49bd29f8eff3e4f024bfc4e7f3a34eaf8b67c1870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(specfile) python311-specfile python3dist(specfile)"
RDEPENDS:${PN} += "python(abi) python311-rpm"

inherit rpm
