SUMMARY = "Python feed generator module (ATOM, RSS, Podcasts)"
DESCRIPTION = "This module can be used to generate web feeds in both ATOM and RSS \
format. It has support for extensions."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "python310-feedgen-0.9.0-2.12.noarch.rpm"
RPM_HASH = "e7061177273cfe795b10fa4e485ed98132a13407bd1b64d53fec126f962216bde599310d2522d2956c9501ef7891a386adeaf260a1104b0d1e6a2b9a12be76b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-feedgen python3.10dist(feedgen) python310-feedgen python3dist(feedgen)"
RDEPENDS:${PN} += "python(abi) python310-lxml python310-python-dateutil"

inherit rpm
