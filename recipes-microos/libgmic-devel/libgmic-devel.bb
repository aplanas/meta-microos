SUMMARY = "Header and library from gmic for use in other C++ projects"
DESCRIPTION = "Header and library from gmic to needed to develop C++ code that \
uses the gmic functionality provided by the gmic library."
LICENSE = "CECILL-2.1"

PV = "3.2.5"

RPM_NAME = "libgmic-devel-3.2.5-1.1.aarch64.rpm"
RPM_HASH = "d68059fc3241535300cad9600b239aa6fd119391c0fb470209b3f12c46a771fc99633f50882352b9852fcfadb67624747ad4a772c950ce0f6b3d0ffb8920f95a"

RPROVIDES:${PN} += "libgmic-devel libgmic-devel(aarch-64)"
RDEPENDS:${PN} += "libgmic3"

inherit rpm
