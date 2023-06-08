SUMMARY = "3D graphics using VRML for Octave"
DESCRIPTION = "3D graphics using VRML. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.0.13"

RPM_NAME = "octave-forge-vrml-1.0.13-1.22.aarch64.rpm"
RPM_HASH = "0434fa43882e22d6d4f119a8d95a609f166b7a07a059625a6c9879934b604c4319f14420955cbaf2e0acceac40d20cdd289c41bc3fd7837da60a0f2d8d4770cb"

RPROVIDES:${PN} += "octave-forge-vrml octave-forge-vrml(aarch-64)"
RDEPENDS:${PN} += "/bin/sh octave-cli octave-forge-linear-algebra octave-forge-miscellaneous octave-forge-statistics octave-forge-struct"

inherit rpm
