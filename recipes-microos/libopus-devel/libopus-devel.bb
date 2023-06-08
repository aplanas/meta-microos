SUMMARY = "Opus Audio Codec Library Development Environment"
DESCRIPTION = "The Opus codec is designed for interactive speech and audio transmission over \
the Internet. It is designed by the IETF Codec Working Group and incorporates \
technology from Skype's SILK codec and Xiph.Org's CELT codec."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "libopus-devel-1.4-1.1.aarch64.rpm"
RPM_HASH = "92a9c8c7a9f2dee07120685fee9114cb733d34cc4f0b9878feb7f67866be621ab72e1ee6eff83be316b951a600e6596dc5848d138d927064b65394b813d0da73"

RPROVIDES:${PN} += "libopus-devel libopus-devel(aarch-64) pkgconfig(opus)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopus0"

inherit rpm
