SUMMARY = "Symbol stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-symbols package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-symbols-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "f176150c091301870fc4f7a5209d085d66c5b87487833d2abe8b9d533e43733b4fa4e7d63a3af21f47698d613ba486e7a7da92890c99c68fe593e22fb0a586b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category tuxpaint-stamps-symbols"
RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
