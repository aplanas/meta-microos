SUMMARY = "Csound opcodes for python"
DESCRIPTION = "Csound opcodes for python"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "python3-csound-6.18.1-3.1.aarch64.rpm"
RPM_HASH = "42f3c83c327968f418a61372168b2f19b45264b445cba3d71460ce529fc2eb5dc72a514402a9e46f486194f27c5f1485463a8ae317842eef4144eca73999d644"

RPROVIDES:${PN} += "python3-csound python3-csound(aarch-64)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
