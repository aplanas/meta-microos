SUMMARY = "SGML/XML Parsers"
DESCRIPTION = "SGMLSpm is a Perl script that reads ESIS output (from parsers like SP) \
and offers an event-based interface to the parser. As long as the \
parser can parse XML this also works for XML."
LICENSE = "GPL-2.0"

PV = "1.1"

RPM_NAME = "perl-SGMLS-1.1-1.17.aarch64.rpm"
RPM_HASH = "92942f49bb30d141a62d18b46bfae3cba0e1e36a4db0df83941ead6b42daa15f0a4f1b50722ae2d846131f37d6762cc3fd3c05df4ab4ebb663deb7b837dd94d8"

RPROVIDES:${PN} += "perl(SGMLS) perl(SGMLS::Output) perl(SGMLS::Refs) perl(SGMLS_Attribute) perl(SGMLS_Element) perl(SGMLS_Entity) perl(SGMLS_Event) perl(SGMLS_Notation) perl-SGMLS perl-SGMLS(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
