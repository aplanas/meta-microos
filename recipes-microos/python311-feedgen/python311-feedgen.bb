SUMMARY = "Python feed generator module (ATOM, RSS, Podcasts)"
DESCRIPTION = "This module can be used to generate web feeds in both ATOM and RSS \
format. It has support for extensions."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "python311-feedgen-0.9.0-2.12.noarch.rpm"
RPM_HASH = "1224157b50fd5ce5e5d3269b997a17ed109fb8cf3d47cc49fe23802053bcf057184f72854424705b20174a773bc4e70930cce20eed2552a7686ec176a5875ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(feedgen) \
python311-feedgen \
python3dist(feedgen)"
RDEPENDS:${PN} += "python(abi) \
python311-lxml \
python311-python-dateutil"

inherit rpm
