SUMMARY = "Session / policy manager implementation for PipeWire (audio support)"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire. \
 \
This package enables the use of alsa devices in PipeWire."
LICENSE = "MIT"

PV = "0.4.14"

RPM_NAME = "wireplumber-audio-0.4.14-2.1.noarch.rpm"
RPM_HASH = "6d64dfd74de0a1ee27be0f8d8921259e38ac7b445c9b3e32922002a4d466cd6689da05332cb7c34aa69a3873a0416df611874b02eca820dd5c9b0a4af90b740f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wireplumber-audio"
RDEPENDS:${PN} += "libwireplumber-0_4-0 wireplumber"

inherit rpm
