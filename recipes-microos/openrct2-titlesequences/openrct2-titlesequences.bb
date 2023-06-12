SUMMARY = "Titlesequences for openRCT2"
DESCRIPTION = "This package contains tilesequences like the original ones \
used in RollerCoaster Tycoon 1 and 2. \
When using RCT1 sequences, the original RCT1 files have to be installed."
LICENSE = "GPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "openrct2-titlesequences-0.4.3-2.2.noarch.rpm"
RPM_HASH = "af92fd9d626a4a30619d36755c5acec7041c170ccc19c97a6eed2a5ff8236336cc1deed1ec6350f2392e29c0c608593be3f4889c15abdd5a2c3178ae9b2e46a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openrct2-titlesequences"
RDEPENDS:${PN} += "openrct2"

inherit rpm
