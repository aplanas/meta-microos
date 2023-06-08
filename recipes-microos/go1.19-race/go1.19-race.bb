SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.19.9"

RPM_NAME = "go1.19-race-1.19.9-1.1.aarch64.rpm"
RPM_HASH = "52ea3f75b879f9aa2b8697b2daf13c6943703e170083cd695d4a370d004e3429bed58c9386a734d908c6ce37eaf8f258dbd5ec1dfcbc11cbd93b3a26c6e9f6e4"

RPROVIDES:${PN} += "go1.19-race go1.19-race(aarch-64)"
RDEPENDS:${PN} += "go1.19"

inherit rpm
