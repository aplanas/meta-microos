SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.15.15"

RPM_NAME = "go1.15-doc-1.15.15-1.12.aarch64.rpm"
RPM_HASH = "95646f9d817e0d22ccd61f49223fbb01a6340cc0723e8c36aa42960339b0623068a9fcebc4478b938fe266bbcb705b137a00e6b3640f5f31028344a5b2d5257a"

RPROVIDES:${PN} += "go-doc \
go1.15-doc \
go1.15-doc(aarch-64)"
RDEPENDS:${PN} += "go1.15"

inherit rpm
