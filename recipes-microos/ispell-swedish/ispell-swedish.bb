SUMMARY = "Swedish ispell dictionary"
DESCRIPTION = "This package includes a ready Swedish dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-swedish-1.5-422.6.aarch64.rpm"
RPM_HASH = "5d939a8351d125105113a66d42d666afa5e464f5264b6ddc9e9bf2ff52b38324b12a49526c151346481eb5d819f439b70db1eab7d637c87a3ac0a6185062a80a"

RPROVIDES:${PN} += "ispell-swedish \
ispell-swedish(aarch-64) \
ispell_dictionary \
iswedish \
locale(ispell:sv)"
RDEPENDS:${PN} += ""

inherit rpm
