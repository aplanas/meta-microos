SUMMARY = "A bootstrapping and management tool for k0s clusters"
DESCRIPTION = "k0sctl is a bootstrapping and management tool for k0s clusters."
LICENSE = "Apache-2.0"

PV = "0.12.2"

RPM_NAME = "k0sctl-0.12.2-1.9.aarch64.rpm"
RPM_HASH = "828e56acc9a5017cbde85f20e1c9a86a85330e21cb971f5f7951017408c53efd3511baadb04b698d15e96c57c08a1d88e5c0f5aea4378da22884eb0140d81ef8"

RPROVIDES:${PN} += "k0sctl k0sctl(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
