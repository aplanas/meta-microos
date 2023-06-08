SUMMARY = "Synced document buffers"
DESCRIPTION = "obby is a library which provides synced document buffers. It supports \
multiple documents in one session and is portable to both Windows and \
Unix-like platforms. \
 \
 \
 \
Authors: \
-------- \
    Armin Burgmeier <armin@0x539.de> \
    Philipp Kern <phil@0x539.de>"
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "obby-0.4.8-11.29.aarch64.rpm"
RPM_HASH = "d95d33eb7553f89f7f2b6239bfe40ba8a2cd757673c9369eafed8c13dc59cb0fa695d778a0e0f647e993e081c1d07e4a2c42cd2fa075998be2c1710fdf61838f"

RPROVIDES:${PN} += "obby obby(aarch-64)"
RDEPENDS:${PN} += "libobby-0_4-1 obby-lang"

inherit rpm
