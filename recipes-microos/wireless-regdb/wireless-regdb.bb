SUMMARY = "802.11 regulatory domain database"
DESCRIPTION = "The 802.11 regulatory domain database is used by CRDA and provides allowed \
frequency ranges for 802.11 wireless drivers."
LICENSE = "ISC"

PV = "20230503"

RPM_NAME = "wireless-regdb-20230503-1.1.noarch.rpm"
RPM_HASH = "2010f0267670e8c81d8918b00ec6923fba1085c7010b57a3cbc4b574ee822f0a7004e742fdf279af192e8e1d59e116edd3462696399b6c72ac3b817ec9c15387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(regulatory.db) firmware(regulatory.db.p7s) wireless-regdb"
RDEPENDS:${PN} += ""

inherit rpm
