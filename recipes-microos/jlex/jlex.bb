SUMMARY = "A Lexical Analyzer Generator for Java"
DESCRIPTION = "JLex is a lexical analyzer generator for Java."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "jlex-1.2.6-283.6.noarch.rpm"
RPM_HASH = "9a918996c13e151236a83c62e037258279abd85f7f6cc40802c136fd645674ce8c3f825f96153154d04997d9f18a07aabf97c11351a7468e86ccafe65ae44e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlex"
RDEPENDS:${PN} += ""

inherit rpm
