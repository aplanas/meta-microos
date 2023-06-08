SUMMARY = "Build backend used by Hatch"
DESCRIPTION = "This is the extensible, standards compliant build backend used by Hatch."
LICENSE = "MIT"

PV = "1.14.1"

RPM_NAME = "python311-hatchling-1.14.1-1.1.noarch.rpm"
RPM_HASH = "35d1280546b30ec6b227d15badd2dfd7fff8553e46ca4714caa03b90cd2bc125149c6111372e1e8c457ed591eb54ace8ee4801171b7fac7243fe548e37b45f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hatchling) python311-hatchling python3dist(hatchling)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-editables python311-packaging python311-pathspec python311-pluggy python311-trove-classifiers update-alternatives"

inherit rpm
