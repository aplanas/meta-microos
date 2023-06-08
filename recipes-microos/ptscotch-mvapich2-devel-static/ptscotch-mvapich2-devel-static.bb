SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mvapich2-devel-static-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "f14d4034a3483da045cbca52f01f9898b7c2b8a64fd5fa19ebdb8c01b053095cd8a36b87b28a67b91445eb6a267ba5b562b8944d9b47925a5be9de37363af936"

RPROVIDES:${PN} += "ptscotch-mvapich2-devel-static ptscotch-mvapich2-devel-static(aarch-64) scotch-devel-static"
RDEPENDS:${PN} += "ptscotch-mvapich2-devel"

inherit rpm
