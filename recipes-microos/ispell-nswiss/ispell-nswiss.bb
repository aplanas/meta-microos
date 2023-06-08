SUMMARY = "New Swiss ispell dictionary"
DESCRIPTION = "This package includes a ready Swiss dictionary for ispell according \
the new spelling rules.  The name of the dictionary is nswiss to be able \
to distinguish it from those of the German packages. A short usage \
description is given in /usr/share/doc/packages/ispell/README of the \
package ispell."
LICENSE = "GPL-2.0+"

PV = "20161207"

RPM_NAME = "ispell-nswiss-20161207-2.14.aarch64.rpm"
RPM_HASH = "9d1eacdd4e5bf01411149690541b87de939f0eaf3f925408cf4798f49d1bc65408c70c56edc1292d2ca06d770eb8f6362b093c626d6d06dc24536d4727fd24b0"

RPROVIDES:${PN} += "ispell-nswiss ispell-nswiss(aarch-64) ispell_dictionary locale(ispell:de_CH)"
RDEPENDS:${PN} += ""

inherit rpm
