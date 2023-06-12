SUMMARY = "Czech ispell dictionary"
DESCRIPTION = "This package includes a ready Czech dictionary for ispell. A short \
usage description is given in /usr/share/doc/packages/ispell/README of \
the package ispell. The sources for this dictionary are included in \
the package dicts."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ispell-czech-1.5-422.6.aarch64.rpm"
RPM_HASH = "792e82a26c8b5df5a37bae534e9ae8fb60cfd2a7796bd5d459b75db854e2dbb6c2a76a482e46cfd2339b72ca83fd335db72096a777b71aad8eeef38ac3b841aa"

RPROVIDES:${PN} += "iczech \
ispell-czech \
ispell-czech(aarch-64) \
ispell_dictionary \
locale(ispell:cs;sk)"
RDEPENDS:${PN} += ""

inherit rpm
