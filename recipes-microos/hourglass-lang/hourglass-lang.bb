SUMMARY = "Translations for package hourglass"
DESCRIPTION = "Provides translations for the 'hourglass' package."
LICENSE = "GPL-3.0-only"

PV = "2.0.2"

RPM_NAME = "hourglass-lang-2.0.2-1.10.noarch.rpm"
RPM_HASH = "e8ab9f4e9b5d591ddfe5146d7f422db78f75c806ce15ba9534ec307b8ba3e50917969a17a87bbf9a20c9220dd98573faafdf63ca80de47712d86322c2a19ca97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hourglass-lang \
hourglass-lang-all \
locale(hourglass:bs) \
locale(hourglass:de) \
locale(hourglass:es) \
locale(hourglass:et) \
locale(hourglass:fr) \
locale(hourglass:it) \
locale(hourglass:ja) \
locale(hourglass:lt) \
locale(hourglass:pt) \
locale(hourglass:pt_BR) \
locale(hourglass:ru) \
locale(hourglass:sv) \
locale(hourglass:tr)"
RDEPENDS:${PN} += "hourglass"

inherit rpm
