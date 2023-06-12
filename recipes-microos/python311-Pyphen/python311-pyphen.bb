SUMMARY = "Pure Python module to hyphenate text"
DESCRIPTION = "Pyphen is a pure Python module to hyphenate text using existing Hunspell \
hyphenation dictionaries. \
 \
This module is a fork of python-hyphenator, written by Wilbert Berendsen."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MPL-1.1"

PV = "0.10.0"

RPM_NAME = "python311-Pyphen-0.10.0-1.10.noarch.rpm"
RPM_HASH = "19db5049310b7820f94aad77639db31a8f5fab429d8e947e40d328dbc5ecc7bb8b95326c55cd250b3624a4503dff99c6011a1bcef9da74cb1e0e34c1df3eb678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyphen) \
python311-Pyphen \
python3dist(pyphen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
