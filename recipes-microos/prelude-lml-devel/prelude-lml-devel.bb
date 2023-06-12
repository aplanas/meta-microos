SUMMARY = "Header files and libraries for prelude-lml development"
DESCRIPTION = "Libraries, include files, etc you can use to develop custom \
Prelude LML plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-lml-devel-5.2.0-2.9.aarch64.rpm"
RPM_HASH = "90f38404e26936f49d31cfb82e4ef689d9b8b9533f0f99f751474b1a71850233707e1bf65c14a21653c0aab0f431c0921209a66317b3dba781bf92822231a142"

RPROVIDES:${PN} += "prelude-lml-devel prelude-lml-devel(aarch-64)"
RDEPENDS:${PN} += "libprelude-devel prelude-lml"

inherit rpm
