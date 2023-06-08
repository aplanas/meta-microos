SUMMARY = "MATE Utilities"
DESCRIPTION = "MATE Utilities"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_utilities-20170319-5.3.aarch64.rpm"
RPM_HASH = "e9ea6b34dfd3c5b28ff4ebc0a987229e5f73f4efaa4b018df5a5c59211caeb8d68fdaacc698eac6e7d183101403b38da075515a1fa91e06950e5c0491a37acf2"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() patterns-mate-mate_utilities patterns-mate-mate_utilities(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
