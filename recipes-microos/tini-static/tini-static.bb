SUMMARY = "A tiny but valid init for containers, with libc linked statically"
DESCRIPTION = "Tini is a trivial implementation for an 'init' program. \
 \
All Tini does is spawn a single child (Tini is meant to be run in a container), \
and wait for it to exit, all the while reaping zombies and performing signal forwarding. \
 \
This variant is statically linked to libc so that it will not be \
needed inside the container."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "tini-static-0.19.0-2.1.aarch64.rpm"
RPM_HASH = "a610392d44e88c6f8c0d3ce8c3105e51a53712002f983960c6e28ae7584182b03373c27ba2afb69baf43b581472f836cdaaa8ec80c71eaa4c794dd7ec9610048"

RPROVIDES:${PN} += "tini-static tini-static(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
