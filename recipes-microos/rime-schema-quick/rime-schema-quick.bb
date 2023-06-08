SUMMARY = "quick input schema for rime"
DESCRIPTION = "quickinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-quick-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "dc96069356e7d67bd9bf63ec507a69eea641e6f725e1a5872e6119bd0601bf96914d4e4f62d6b4c92e1969413b8055e572944f25ace896407e51d5eb2fabb1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-quick"
RDEPENDS:${PN} += ""

inherit rpm
