SUMMARY = "Deepin Internet"
DESCRIPTION = "Deepin Internet Applications."
LICENSE = "MIT"

PV = "15.4.20220603"

RPM_NAME = "patterns-deepin-deepin_internet-15.4.20220603-2.3.aarch64.rpm"
RPM_HASH = "e49c5e03108488c7bbf8f1513eed78cec478cca4ed58f1af0a4d32afe0ff7313db2c51bf172b0006d911cdfa661e287e2c44613ba6570e0a32435d64dbcc3432"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() patterns-deepin-deepin_internet patterns-deepin-deepin_internet(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
