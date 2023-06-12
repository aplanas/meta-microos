SUMMARY = "Python implementation of MikroTik RouterOS API"
DESCRIPTION = "Python implementation of MikroTik RouterOS API. \
http://wiki.mikrotik.com/wiki/API"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.1"

RPM_NAME = "python39-librouteros-3.2.1-1.3.noarch.rpm"
RPM_HASH = "37c9a3003a11f13c0b265fe0d6afcd1ef25b696cbfeeb18e511dab410be1b79fe8d586a821e1560d23a27c94a354fbe24bf71fa95cd2418f927d171253d25ce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(librouteros) \
python39-librouteros \
python3dist(librouteros)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
