SUMMARY = "Connect to the Jack Sound Server with Qt"
DESCRIPTION = "QJack makes you connect with the Jack soundserver system with Qt."
LICENSE = "GPL-2.0-or-later"

PV = "0.0+20170112"

RPM_NAME = "libqjack-devel-0.0+20170112-3.22.aarch64.rpm"
RPM_HASH = "6de28acd059041b703b74db9a18583fc5374ff9fce462504a4377225da21affb831628d84173514ba764b4801626c59e04a6afcd53c55d6cce473baf901aae50"

RPROVIDES:${PN} += "libqjack-devel libqjack-devel(aarch-64)"
RDEPENDS:${PN} += "jack-devel libqjack0 pkgconfig(Qt5Core)"

inherit rpm
