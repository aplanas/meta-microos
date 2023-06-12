SUMMARY = "Library for decoding and encoding video in the Dirac format"
DESCRIPTION = "The Schroedinger project implements portable libraries for the high \
quality Dirac video codec created by BBC Research and Development. \
Dirac is a free and open source codec producing very high image quality \
video. The project produces two libraries in ANSI C89, one for decoding \
and one for encoding."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1 & MIT"

PV = "1.0.11"

RPM_NAME = "schroedinger-devel-1.0.11-11.17.aarch64.rpm"
RPM_HASH = "04cd1d911dda5a0deda0361382d49bb7d4664a2d42b3be206aa97f45cde61a12c78bf52b7ee0a1238e8cece9b29015686acb89dafaf53e36de990ccd4bcb2524"

RPROVIDES:${PN} += "libschroedinger-devel \
pkgconfig(schroedinger-1.0) \
schroedinger-devel \
schroedinger-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libschroedinger-1_0-0 \
orc \
pkgconfig(orc-0.4)"

inherit rpm
