SUMMARY = "Header files and libraries for prelude-lml development"
DESCRIPTION = "Libraries, include files, etc you can use to develop custom \
Prelude LML plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-lml-devel-5.2.0-2.8.aarch64.rpm"
RPM_HASH = "59dace4bb296dbb893091de450df654a21594fa4d2930b96e8ecd48580839cbad33cdd1512aa3e303081c5230292a60acd4645566cc1fcaeedc1a74e59f88c28"

RPROVIDES:${PN} += "prelude-lml-devel prelude-lml-devel(aarch-64)"
RDEPENDS:${PN} += "libprelude-devel prelude-lml"

inherit rpm
