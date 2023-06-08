SUMMARY = "Session / policy manager implementation for PipeWire"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire."
LICENSE = "MIT"

PV = "0.4.14"

RPM_NAME = "wireplumber-0.4.14-1.1.aarch64.rpm"
RPM_HASH = "e692b70eae073468fb87903694a05df2ffa9d5e938b573ce8d1164ab239d79bdd8d4e260ba6d556971c9278b2473a1590b1fbde4d0444508736f7c84be6622b4"

RPROVIDES:${PN} += "libwireplumber-module-default-nodes-api.so()(64bit) libwireplumber-module-default-nodes.so()(64bit) libwireplumber-module-default-profile.so()(64bit) libwireplumber-module-file-monitor-api.so()(64bit) libwireplumber-module-logind.so()(64bit) libwireplumber-module-lua-scripting.so()(64bit) libwireplumber-module-metadata.so()(64bit) libwireplumber-module-mixer-api.so()(64bit) libwireplumber-module-portal-permissionstore.so()(64bit) libwireplumber-module-reserve-device.so()(64bit) libwireplumber-module-si-audio-adapter.so()(64bit) libwireplumber-module-si-audio-endpoint.so()(64bit) libwireplumber-module-si-node.so()(64bit) libwireplumber-module-si-standard-link.so()(64bit) pipewire-session-manager wireplumber wireplumber(aarch-64)"
RDEPENDS:${PN} += "(wireplumber-audio if pipewire-pulseaudio) /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) liblua5.4.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpipewire-0.3.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libwireplumber-0.4.so.0()(64bit) pipewire"

inherit rpm
