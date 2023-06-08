SUMMARY = "Pure Python module to hyphenate text"
DESCRIPTION = "Pyphen is a pure Python module to hyphenate text using existing Hunspell \
hyphenation dictionaries. \
 \
This module is a fork of python-hyphenator, written by Wilbert Berendsen."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MPL-1.1"

PV = "0.10.0"

RPM_NAME = "python310-Pyphen-0.10.0-1.10.noarch.rpm"
RPM_HASH = "7762e041be7f42775c96d886d6c086befe18cdfb05047c6935ac7d3ae6bd31a605badba89aa37f7d416670aea3893e65eec75bdc35b107f0ddcd34070230063c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pyphen python3.10dist(pyphen) python310-Pyphen python3dist(pyphen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
