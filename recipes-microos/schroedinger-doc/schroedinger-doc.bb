SUMMARY = "Library for decoding and encoding video in the Dirac format"
DESCRIPTION = "The Schroedinger project implements portable libraries for the high \
quality Dirac video codec created by BBC Research and Development. \
Dirac is a free and open source codec producing very high image quality \
video. The project produces two libraries in ANSI C89, one for decoding \
and one for encoding."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1 & MIT"

PV = "1.0.11"

RPM_NAME = "schroedinger-doc-1.0.11-11.17.aarch64.rpm"
RPM_HASH = "8974f8d8e758bf19d65c7539156c2681eeeb26b84821dfa5811c2e735ba979950e625b7ceeb87f9002638df23ecf8fb3df3010fc5900aefa491e279ebb3f09c7"

RPROVIDES:${PN} += "schroedinger-doc schroedinger-doc(aarch-64)"
RDEPENDS:${PN} += "libschroedinger-1_0-0"

inherit rpm
