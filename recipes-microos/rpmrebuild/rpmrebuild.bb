SUMMARY = "A tool to build a rpm file from the rpm database"
DESCRIPTION = "rpmrebuild allows to build an rpm file from an installed rpm, or from \
another rpm file, with or without changes (batch or interactive). It \
can be extended by a plugin system. A typical use is to easy repackage \
a software after some configuration's change."
LICENSE = "GPL-2.0-or-later"

PV = "2.17"

RPM_NAME = "rpmrebuild-2.17-1.1.noarch.rpm"
RPM_HASH = "98c915fce18790d5ecca96402e217734a052a1936112449ee39c22314a1d753526c2ace818eb56a119dcf9e6304234c72e6b4d832df2d09cfb5f1486ebb12b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpmrebuild"
RDEPENDS:${PN} += "/usr/bin/sh bash coreutils cpio rpm-build sed"

inherit rpm
