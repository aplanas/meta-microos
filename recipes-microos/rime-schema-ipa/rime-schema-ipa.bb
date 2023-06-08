SUMMARY = "ipa input schema for rime"
DESCRIPTION = "ipainput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-ipa-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "4b40a6adddcc420aeae21b124f5fef32e8ed9ac660f0c4d5cc3de0b32a4799f4f06a1185b4ed67f24acf27c4856751759e6d43589479b067e597e8425acd646d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-ipa"
RDEPENDS:${PN} += ""

inherit rpm
