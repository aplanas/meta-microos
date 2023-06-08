SUMMARY = "wugniu input schema for rime"
DESCRIPTION = "wugniuinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-wugniu-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "8f2e1f82467f31e79e22e2dd1c3351d8327d91b949d1dd9c8dba453121192c8a1efc3678d364bcd7215fa28ad951da30a6517bbab26da2a03ae324e682a5c530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-wugniu"
RDEPENDS:${PN} += ""

inherit rpm
