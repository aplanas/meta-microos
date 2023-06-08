SUMMARY = "emoji input schema for rime"
DESCRIPTION = "emojiinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-emoji-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "e0e0925d3921f00a4ae8b3d45732eed0a5af0332eecbd13464c6c81fa7775234f7a1f052829ceefd4b42a08b1b0b4f043a151bb06fdeef068966fbdf409e9745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-emoji"
RDEPENDS:${PN} += ""

inherit rpm
