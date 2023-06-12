SUMMARY = "Module to resolve abstract dependencies into concrete ones"
DESCRIPTION = "A Python module to resolve abstract dependencies into concrete ones."
LICENSE = "ISC"

PV = "0.8.1"

RPM_NAME = "python311-resolvelib-0.8.1-7.1.noarch.rpm"
RPM_HASH = "cfdffe6b5ddbb39a2a02b4963d80fab50218cd44f2b7b7ef2cd0e751d713565e506e865a2b0674e11ce474f2db93490ebd03ae75acf1a01617917c9caf014480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(resolvelib) \
python311-resolvelib \
python3dist(resolvelib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
