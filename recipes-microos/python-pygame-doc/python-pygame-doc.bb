SUMMARY = "Pygame documentation and example programs"
DESCRIPTION = "This package contains documentation and example programs for Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python-pygame-doc-2.1.3-2.1.aarch64.rpm"
RPM_HASH = "fd47336ea09985921ed3801c928281b8206e5f4b9d4fb901ce3ac3465a9281d38e6da848bb2c006a09604fce93567557e9bb9088692d3deec66a8951f1f48620"

RPROVIDES:${PN} += "pygame-doc \
python-pygame-doc \
python-pygame-doc(aarch-64) \
python310-pygame-doc \
python311-pygame-doc \
python39-pygame-doc"
RDEPENDS:${PN} += ""

inherit rpm
