SUMMARY = "Setup Prometheus, Thanos & friends across multiple clusters"
DESCRIPTION = "Krius is a cli tool to setup and manage Prometheus, Thanos & friends across multiple clusters easily for scale"
LICENSE = "Apache-2.0"

PV = "0.1.1"

RPM_NAME = "krius-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "b132d81f4538a3850d68d369634443a0413016e95a61d3b4d6a75980dd636f50f80f5bba01323d10441a81395bf81ded20cffd06af595669f676fc4d06d1992e"

RPROVIDES:${PN} += "krius krius(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
