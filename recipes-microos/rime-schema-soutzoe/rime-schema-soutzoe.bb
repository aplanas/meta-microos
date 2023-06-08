SUMMARY = "soutzoe input schema for rime"
DESCRIPTION = "soutzoeinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-soutzoe-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "d793795c47ebd01885955456291820585143c8d10be59a6bc18f949d0d440eab647a39ebb78becc5023aa785b257323005bf3a7195052823a75e8ee21af87741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-soutzoe"
RDEPENDS:${PN} += ""

inherit rpm
