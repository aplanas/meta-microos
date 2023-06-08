SUMMARY = "Trusted collections handling: server and signer"
DESCRIPTION = "The Notary project comprises a server and a client for running and \
interacting with trusted collections."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "notary-0.7.0-1.12.aarch64.rpm"
RPM_HASH = "f3a79b9fe0bdcc7ff75808286b18917fae39371d35a4378d0f2dc779309f2af14644b8f30bb316030246ce0586a35617690508dff7123327b90d3c8a90b9df93"

RPROVIDES:${PN} += "config(notary) notary notary(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
