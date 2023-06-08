SUMMARY = "Library of C++ templates implementing universal Clifford algebras"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions. \
 \
This package contains the header files required for developing \
applications using the glucat library."
LICENSE = "LGPL-3.0-only"

PV = "0.12.0"

RPM_NAME = "glucat-devel-0.12.0-3.3.aarch64.rpm"
RPM_HASH = "acf9b01f286fb52dc0d954f6643c0f58a59d311f67cfba088e7306ab907fe9386c204f980d192b08f7c983255876c9caf1d64ff2d3ac87862afb036cd467242c"

RPROVIDES:${PN} += "glucat-devel glucat-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
