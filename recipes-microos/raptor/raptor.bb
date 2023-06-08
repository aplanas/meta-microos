SUMMARY = "RDF Parser Toolkit"
DESCRIPTION = "Raptor is the RDF Parser Toolkit for Redland that provides a set of \
standalone RDF parsers, generating triples from RDF/XML or N-Triples."
LICENSE = "LGPL-2.1-or-later | GPL-2.0-or-later | Apache-2.0"

PV = "2.0.15"

RPM_NAME = "raptor-2.0.15-3.17.aarch64.rpm"
RPM_HASH = "ac1f7b4e02a1859f00069bd058e42549c84cdfeb2c7364ff8b5a4e368a8eedcb3946e7a603ad51e4d77dcd5ae8e45649d41cd640cdc76a4e41178cf106defe58"

RPROVIDES:${PN} += "raptor raptor(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libraptor2.so.0()(64bit)"

inherit rpm
