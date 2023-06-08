SUMMARY = "Session / policy manager implementation for PipeWire (audio support)"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire. \
 \
This package enables the use of alsa devices in PipeWire."
LICENSE = "MIT"

PV = "0.4.14"

RPM_NAME = "wireplumber-audio-0.4.14-1.1.noarch.rpm"
RPM_HASH = "943d8462e67aed41d4218346f7b929d8d9272a63394bcc458767dd750d66080ef2b0893a61041f0c8ddaf0962c3e7058db811a0651b026a0c2e0f86245332be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wireplumber-audio"
RDEPENDS:${PN} += "libwireplumber-0_4-0 wireplumber"

inherit rpm
