SUMMARY = "Pretty console printing of tabular data"
DESCRIPTION = "Formatted console printing of tabular data. \
tableprint lets you easily print formatted tables of data. \
Unlike other modules, you can print single rows of data at a time \
(useful for printing ongoing computation results)."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-tableprint-0.9.1-3.3.noarch.rpm"
RPM_HASH = "5fa74b1840271f1d98f11719d2dc532d1ceb629012a1df4e4a80ef9967e7e33c114e9478f61220466f17afc38c06d2bcdd06597512a38fe506dc5cc9f14c119e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tableprint) python311-tableprint python3dist(tableprint)"
RDEPENDS:${PN} += "python(abi) python311-future python311-wcwidth"

inherit rpm
