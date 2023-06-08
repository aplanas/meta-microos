SUMMARY = "Include Files and Libraries for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications using functions provided by the TidyLib library."
LICENSE = "W3C"

PV = "1.04"

RPM_NAME = "libtidyp-devel-1.04-16.27.aarch64.rpm"
RPM_HASH = "e0308b9401d104318653ff60f9963aa49c4ffa6a179ae157664e63b3ddcab4bee3114c108700bb60a528c8d5b45d247b075b8423c1e2f1c0b891c148b5041ca0"

RPROVIDES:${PN} += "libtidyp-devel libtidyp-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libtidyp-1_04-0"

inherit rpm
