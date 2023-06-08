SUMMARY = "Vim support for poke"
DESCRIPTION = "Provides Vim support for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "vim-poke-3.1-1.1.noarch.rpm"
RPM_HASH = "79b5daba0cd5f25d55d0144e308c310116ecfa94620f436611c11bebdf4df75981543befd9d244b77886e64c5f3a48a980ca9c0491200f2ad19aaa5e44ebd765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-poke"
RDEPENDS:${PN} += "poke vim"

inherit rpm
