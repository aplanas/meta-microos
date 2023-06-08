SUMMARY = "The Quasar DV codec"
DESCRIPTION = "The Quasar DV codec (libdv) is a software codec for DV video, the \
encoding format used by most digital camcorders, typically those that \
support the IEEE 1394 (a.k.a. FireWire or i.Link) interface. Libdv was \
developed according to the official standards for DV video: IEC 61834 \
and SMPTE 314M."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdv-devel-1.0.0-179.5.aarch64.rpm"
RPM_HASH = "77500678e281ce1b92a84fc7d38ecd4f4da94670fe9d2e406eeb58e4f490e838de91566fb40b17082ad5163c20ec0bd9c1bf861cff92ffd4045fff2b271fc777"

RPROVIDES:${PN} += "libdv-devel libdv-devel(aarch-64) pkgconfig(libdv)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdv4"

inherit rpm
