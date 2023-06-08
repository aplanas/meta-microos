SUMMARY = "Setup Prometheus, Thanos & friends across multiple clusters"
DESCRIPTION = "Krius is a cli tool to setup and manage Prometheus, Thanos & friends across multiple clusters easily for scale"
LICENSE = "Apache-2.0"

PV = "0.1.1"

RPM_NAME = "krius-0.1.1-1.2.aarch64.rpm"
RPM_HASH = "5b0e0a9f041e577fd4c1c33fcda0adb4f141136ded71d71f6629a8ed6767e128c5ae5b76150ff71fca891f58b52cf436fedc22839b3ce574c22ff55f67669c7f"

RPROVIDES:${PN} += "krius krius(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
