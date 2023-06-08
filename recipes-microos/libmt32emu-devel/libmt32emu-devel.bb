SUMMARY = "Development files for libmt32emu"
DESCRIPTION = "A multi-platform software synthesiser emulating pre-GM MIDI devices such as the Roland MT-32, CM-32L, CM-64 and LAPC-I. \
Development files for libmt32emu."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.7.0"

RPM_NAME = "libmt32emu-devel-2.7.0-1.3.aarch64.rpm"
RPM_HASH = "66e1e3335587c9f9fbbba2d35c8770f9d21e07f503df1d5d750e07f2292d1ac9e7a34268c3e2ccf95dcf0ff2e5d2572781aaf1e0df88f9a2b504eb73f030936c"

RPROVIDES:${PN} += "libmt32emu-devel libmt32emu-devel(aarch-64) pkgconfig(mt32emu)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmt32emu2"

inherit rpm
