SUMMARY = "Google Cloud Guest Agent"
DESCRIPTION = "Google Cloud Guest Agent"
LICENSE = "Apache-2.0"

PV = "20230221.00"

RPM_NAME = "google-guest-agent-20230221.00-2.2.aarch64.rpm"
RPM_HASH = "c75424eaae08756b7f4b447b303ab99d081ff45d10b68a2915be570e1b9365c30ccddda1472fc34cb608d7c5bc427fd5c6e3b13c5f86a090116894d25652adbc"

RPROVIDES:${PN} += "google-compute-engine-init google-guest-agent google-guest-agent(aarch-64)"
RDEPENDS:${PN} += "/bin/sh google-guest-configs"

inherit rpm
