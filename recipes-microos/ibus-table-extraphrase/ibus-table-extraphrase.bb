SUMMARY = "Extra phrases for IBus-table based IME"
DESCRIPTION = "provide Chinese extra phrases for ibus-table based IME, \
such as ibus-table-zhengma, ibus-table-wubi, ibus-table-cangjie5, \
ibus-table-erbi and etc."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.9.20110826"

RPM_NAME = "ibus-table-extraphrase-1.3.9.20110826-9.9.noarch.rpm"
RPM_HASH = "f4ec33a543ee02e0b99d2a9c0593a36e26118494ec56a32cd617497e5b6034bd2a53506ebcfc27b15f66c0247380e7c1680bd45c10aebd9f63e98bd194b1759c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-extraphrase"
RDEPENDS:${PN} += ""

inherit rpm
