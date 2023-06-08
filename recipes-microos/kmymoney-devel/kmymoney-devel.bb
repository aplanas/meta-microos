SUMMARY = "Development Files for KMyMoney"
DESCRIPTION = "Development files and headers need to build software using KMyMoney."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.1.3"

RPM_NAME = "kmymoney-devel-5.1.3-2.9.aarch64.rpm"
RPM_HASH = "3972a178450e29fde4e4c1c6b77aacdfa0c64df8f7eb33461e99d7c95d86da86990fa78ffa64eb643f97842740508785c8d41b6a8aca751d99faecb7fea1be4c"

RPROVIDES:${PN} += "kmymoney-devel kmymoney-devel(aarch-64)"
RDEPENDS:${PN} += "kmymoney"

inherit rpm
