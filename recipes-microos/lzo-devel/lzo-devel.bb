SUMMARY = "Development files for lzo"
DESCRIPTION = "LZO is a portable lossless data compression library written in ANSI C. \
Decompression requires no memory. LZO is suitable for data \
de-/compression in real-time. This means it favours speed over \
compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "lzo-devel-2.10-8.2.aarch64.rpm"
RPM_HASH = "0c8d28fd461b5b69bdba4f116c9e1cc9d070f8ca32631819799f4993809db38379575839375267ee9e7b67549ebc9ef201aca5ee1c7ddb58b4bb8ceb8e09d760"

RPROVIDES:${PN} += "lzo-devel lzo-devel(aarch-64) pkgconfig(lzo2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblzo2-2"

inherit rpm
