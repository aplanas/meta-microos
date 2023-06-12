SUMMARY = "Translations for package heaptrack"
DESCRIPTION = "Provides translations for the 'heaptrack' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "heaptrack-lang-1.4.0-4.4.noarch.rpm"
RPM_HASH = "df89e0a121d92e34905d37d86f640260ce840ae7fcbfb48cad9212d06d5a95eabf4c1c7d1d16bfe8b1d93417e1eb2ba33933dc7a9a403b407b4da4a578a2624c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "heaptrack-lang \
heaptrack-lang-all \
locale(heaptrack:ast) \
locale(heaptrack:ca) \
locale(heaptrack:ca@valencia) \
locale(heaptrack:cs) \
locale(heaptrack:da) \
locale(heaptrack:de) \
locale(heaptrack:en_GB) \
locale(heaptrack:es) \
locale(heaptrack:fr) \
locale(heaptrack:gl) \
locale(heaptrack:ia) \
locale(heaptrack:ko) \
locale(heaptrack:nl) \
locale(heaptrack:nn) \
locale(heaptrack:pl) \
locale(heaptrack:pt) \
locale(heaptrack:pt_BR) \
locale(heaptrack:ru) \
locale(heaptrack:sk) \
locale(heaptrack:sl) \
locale(heaptrack:sv) \
locale(heaptrack:tr) \
locale(heaptrack:uk) \
locale(heaptrack:zh_CN)"
RDEPENDS:${PN} += "heaptrack"

inherit rpm
