SUMMARY = "802.11 regulatory domain database"
DESCRIPTION = "The 802.11 regulatory domain database is used by CRDA and provides allowed \
frequency ranges for 802.11 wireless drivers."
LICENSE = "ISC"

PV = "20230213"

RPM_NAME = "wireless-regdb-20230213-1.1.noarch.rpm"
RPM_HASH = "8cf4a1fd1614f323d41f04e5dda12eb19d190aabe5b988ec0a365b959ac01e4c91d8932e59b3fe510361665c2b15d20358dd4c117c0f65b500bf01abad073e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(regulatory.db) firmware(regulatory.db.p7s) wireless-regdb"
RDEPENDS:${PN} += ""

inherit rpm
