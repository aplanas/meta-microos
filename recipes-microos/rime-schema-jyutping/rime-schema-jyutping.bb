SUMMARY = "jyutping input schema for rime"
DESCRIPTION = "jyutpinginput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-jyutping-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "0b92674fb424c908608a8f206f32d274d8fe1e398754a06fd0512b61925fb3e68b25e8d4a3bb72955bfa2ae082f794763a92006038871a55539b292589181d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-jyutping"
RDEPENDS:${PN} += ""

inherit rpm
