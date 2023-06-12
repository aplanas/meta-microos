SUMMARY = "combo-pinyin input schema for rime"
DESCRIPTION = "combo-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-combo-pinyin-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "82c6a06ccdfe7b91a15e965fa8baa2b47c8511baf8a0799fd57ca57df51f48d85f10d7ceadc8e2002fdf92546c758dd0cb561dd84650fe85d199a5a807fb476c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-combo-pinyin"
RDEPENDS:${PN} += ""

inherit rpm
