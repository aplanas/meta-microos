SUMMARY = "Files needed for gkrellm2 development"
DESCRIPTION = "Files needed to build plugins for gkrellm2"
LICENSE = "GPL-3.0-or-later"

PV = "2.3.11"

RPM_NAME = "gkrellm-devel-2.3.11-2.10.aarch64.rpm"
RPM_HASH = "5fc6995485865366acd75b693c0483113e65362313db6f529878d2de5656c61c8a6f2d03c18560e083695d2d7e9b07464e471ae120639702d331a9f258212476"

RPROVIDES:${PN} += "gkrellm-devel \
gkrellm-devel(aarch-64) \
pkgconfig(gkrellm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gkrellm \
pkgconfig(gtk+-2.0)"

inherit rpm
