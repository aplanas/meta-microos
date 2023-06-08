SUMMARY = "Data files for the JAG game"
DESCRIPTION = "The aim of JAG is to break all of the target pieces on each level, \
and to do this before the time runs out. Keep doing this until you \
have beaten the last level and won the game. \
 \
Data files (bonus, help, lang, levels, schemes, sounds, tools) for JAG."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.8"

RPM_NAME = "jag-data-0.3.8-2.11.noarch.rpm"
RPM_HASH = "8ea0340519c52d220aadeb3585fa7f5668f0e5057edb8fbe9f410e20362cc825f2352acabd6b2ca94705e48566f3956153351befd27974cfccad6da6f094fdfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jag-data"
RDEPENDS:${PN} += "jag"

inherit rpm
