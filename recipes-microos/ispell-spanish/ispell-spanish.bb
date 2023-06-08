SUMMARY = "Spanish ispell dictionary"
DESCRIPTION = "This package includes a ready Spanish dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-spanish-1.5-422.6.aarch64.rpm"
RPM_HASH = "e55d329ef6a50e7451ab7f477b1e7c4d23e5b86be5892aeb67929e20bf874e954bd5bc9590c8d9d80a2165148bfeae40ac7c586fc0b0f4b06021bdbc78549f2b"

RPROVIDES:${PN} += "ispanish ispell-spanish ispell-spanish(aarch-64) ispell_dictionary locale(ispell:es;an_ES)"
RDEPENDS:${PN} += ""

inherit rpm
