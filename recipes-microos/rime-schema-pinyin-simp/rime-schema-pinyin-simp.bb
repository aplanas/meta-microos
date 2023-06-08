SUMMARY = "pinyin-simp input schema for rime"
DESCRIPTION = "pinyin-simpinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-pinyin-simp-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "5c33126b91e7be96a4793cbdaad55e9001ea39f109614c299ed3cd201b4d54b696331f336296ae62e4c5384173a980d55373663cba5ee4aba994fe51afb53b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-pinyin-simp"
RDEPENDS:${PN} += ""

inherit rpm
