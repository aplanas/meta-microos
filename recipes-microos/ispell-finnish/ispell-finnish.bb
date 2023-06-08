SUMMARY = "Finnish ispell dictionary"
DESCRIPTION = "This package includes a ready Finnish dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-finnish-1.5-422.6.aarch64.rpm"
RPM_HASH = "be212e33eb3048746ad9412aefd2126f40ad07f0f1f34d114263e04b94c50b77d11e665473944c2777bf6a340786729d8769876a3443fe67a0c724312ff34b80"

RPROVIDES:${PN} += "ispell-finnish ispell-finnish(aarch-64) ispell_dictionary locale(ispell:fi)"
RDEPENDS:${PN} += ""

inherit rpm
