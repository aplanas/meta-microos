SUMMARY = "Pure Python module to hyphenate text"
DESCRIPTION = "Pyphen is a pure Python module to hyphenate text using existing Hunspell \
hyphenation dictionaries. \
 \
This module is a fork of python-hyphenator, written by Wilbert Berendsen."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MPL-1.1"

PV = "0.10.0"

RPM_NAME = "python39-Pyphen-0.10.0-1.10.noarch.rpm"
RPM_HASH = "88a14fac96e250310d86b3030cdcf9f820018facb80593f4d4289f0fbebd7eb5fcc1f914646733d2c64e936caba02774d52654a23c9c7fb62343bcbee860f69d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyphen) python39-Pyphen python3dist(pyphen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
