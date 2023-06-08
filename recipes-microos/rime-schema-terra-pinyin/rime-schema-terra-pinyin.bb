SUMMARY = "terra-pinyin input schema for rime"
DESCRIPTION = "terra-pinyininput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-terra-pinyin-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "fcd6ab18ca22db36c62cdff81715379c70361d99746f2a5907c958855e52644c1c6afc681ff1060f87ab0d6c930ef73a84729fb7260420d0981cb3af44d328e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-terra-pinyin"
RDEPENDS:${PN} += ""

inherit rpm
