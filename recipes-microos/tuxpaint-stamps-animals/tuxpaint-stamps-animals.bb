SUMMARY = "Animals stamps stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-animals package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-animals-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "92fb66130014826d8d5331b1b0955b4b6215763fa489fc5f4c82f820ecde339446637d6e1dae3b56feeed9b20d1a8f0b7eb49eb21fa16d433cf982ad23cd41b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-animals \
tuxpaint-stamps-category"
RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
