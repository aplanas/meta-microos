SUMMARY = "stroke input schema for rime"
DESCRIPTION = "strokeinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-stroke-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "946fbe73477415e7bab01c0bed9aabc5800953ec268f14682adafb7b9477ffbc0380223fd07bf045139e6c21902fdf8514def5b1613a04c7caacf7936c47b0ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-stroke"
RDEPENDS:${PN} += ""

inherit rpm
