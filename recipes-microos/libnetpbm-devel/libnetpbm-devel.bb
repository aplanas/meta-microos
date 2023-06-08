SUMMARY = "Header files for the NetPBM libraries"
DESCRIPTION = "These are the libs for the netpbm graphic formats. The tools can be \
found in the netpbm package. The sources are contained in the netpbm \
source package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & IJG & MIT & SUSE-Public-Domain"

PV = "10.96.4"

RPM_NAME = "libnetpbm-devel-10.96.4-5.3.aarch64.rpm"
RPM_HASH = "b9e16bb05f56be499cfd5010caa7a2cc28055f58f8ca4f1fe23b4f1257ceab2e39b6910ed32137ee19abedd13cd2dd0f83d8f2cc965b443cafd42340cc02491e"

RPROVIDES:${PN} += "libnetpbm-devel libnetpbm-devel(aarch-64)"
RDEPENDS:${PN} += "libnetpbm11"

inherit rpm
