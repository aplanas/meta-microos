SUMMARY = "wubi input schema for rime"
DESCRIPTION = "wubi input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-wubi-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "527bbb78f0a5c5ac9146abaf1fd9da08ab453c4a10d91b9b564eb3850d8d6e09b910d7dd2b4a3afc325037078d3b0b132283903e6f74fe22c2c9e8967eafdc53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-wubi"
RDEPENDS:${PN} += ""

inherit rpm
