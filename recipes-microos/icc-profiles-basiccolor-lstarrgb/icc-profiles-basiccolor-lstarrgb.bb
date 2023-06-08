SUMMARY = "Default Editing RGB profile"
DESCRIPTION = "The RGB profile maintaining perceptual equal lightness. \
The LStar-RGB.icc profile is colorimetric identical to the eciRGB_v2 profile."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-basiccolor-lstarrgb-1.2-16.21.noarch.rpm"
RPM_HASH = "fcd85a898b4757c4bd1ac10787ccdb7cdea3fe4721573198702e80b849e269a00139eee6d585112e4f5f1a483f2ea8bdfb79abdca272c45affd4aabdbe3db2ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-basiccolor-lstarrgb"
RDEPENDS:${PN} += "color-filesystem"

inherit rpm
