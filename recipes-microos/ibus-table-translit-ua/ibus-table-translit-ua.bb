SUMMARY = "Translit-ua input method for IBus framework"
DESCRIPTION = "ibus-table-translit-ua provides Translit-ua input method on IBus Table under \
IBus framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-translit-ua-1.3.13-2.3.noarch.rpm"
RPM_HASH = "5dcf09905b49e9d3331ac79fa38a2cbca12dcd1691cfa6d2d5df68c8955d80c485abe015f935ee03566ac15a91292e087c76726731e7abf46daca6fd26557cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-translit-ua \
locale(ibus:uk)"
RDEPENDS:${PN} += "ibus-table"

inherit rpm
