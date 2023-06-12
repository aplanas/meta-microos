SUMMARY = "Routing Recognition and Generation Tools"
DESCRIPTION = "A Routing package for Python that matches URL's to dicts and vice versa."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python311-Routes-2.5.1-3.3.noarch.rpm"
RPM_HASH = "17546907be94049acbb3bfd5d30e235903457337b5c47e22d707368c481991affcc944416527553830e84a735e79831e6418d399ae2451b0aae5ff811f74f6bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(routes) \
python311-Routes \
python311-routes \
python3dist(routes)"
RDEPENDS:${PN} += "python(abi) \
python311-repoze.lru \
python311-six"

inherit rpm
