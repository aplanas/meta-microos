SUMMARY = "Development package for libkomparediff2"
DESCRIPTION = "Development package for libkomparediff2."
LICENSE = "(GPL-2.0-or-later & LGPL-2.0-or-later) & BSD-2-Clause"

PV = "23.04.1"

RPM_NAME = "libkomparediff2-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8ab000a347959f402cfed6e5c802bedc1aea7b922e4f7f43e3df023b4f2cba71cd0634c7050bf4d8cdf2974affe90678fe015bad91e020519aa09fc166d4d19a"

RPROVIDES:${PN} += "cmake(LibKompareDiff2) libkomparediff2-devel libkomparediff2-devel(aarch-64) libkomparediff2-kf5-devel"
RDEPENDS:${PN} += "libkomparediff2-5"

inherit rpm
