SUMMARY = "Software Management"
DESCRIPTION = "The 32bit pattern complementing sw_management."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-sw_management-32bit-20200505-40.1.aarch64.rpm"
RPM_HASH = "00037c635ab55b907e964ac093cd829cfa9900f58923ecb836ee341b62fd50ba5104d1e0f053551bcb6dfc59b004ff426d9670434c7e16ef551e2129baa78761"

RPROVIDES:${PN} += "pattern() patterns-base-sw_management-32bit patterns-base-sw_management-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
