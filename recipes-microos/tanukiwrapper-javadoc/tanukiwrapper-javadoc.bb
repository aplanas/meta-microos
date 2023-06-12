SUMMARY = "Javadoc documentation for tanukiwrapper"
DESCRIPTION = "This package contains the javadoc documentation for tanukiwrapper"
LICENSE = "GPL-2.0-only"

PV = "3.5.35"

RPM_NAME = "tanukiwrapper-javadoc-3.5.35-2.6.aarch64.rpm"
RPM_HASH = "6ad1a8579a4b21cd81047f27210bcb39f3d0957ae34f73ab26394743097938686c7be14d8fca1ef641d47527328a43872b97efc99d4bdcfe1d2ce80380188e0a"

RPROVIDES:${PN} += "tanukiwrapper-javadoc \
tanukiwrapper-javadoc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
