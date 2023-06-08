SUMMARY = "Tutorial documentation for VOTCA Coarse Graining Engine"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains the tutorial documentation and sample data."
LICENSE = "Apache-2.0"

PV = "2022.1"

RPM_NAME = "votca-tutorials-2022.1-3.6.noarch.rpm"
RPM_HASH = "5e28c0f8fd8357b9e120bee06397bd1bfe8ae4c20ebdde778b4561ec4ce6b13f3dd61c10f80d1c60e654ea72d68c73f22eb8912ccd75a467d1b03f63f2fe4e73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "votca-csg-tutorials votca-tutorials"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python2 /usr/bin/python3"

inherit rpm
