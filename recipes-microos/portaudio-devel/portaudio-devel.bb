SUMMARY = "Development package for the portaudio library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
portaudio library."
LICENSE = "MIT"

PV = "190700_20210406"

RPM_NAME = "portaudio-devel-190700_20210406-1.8.aarch64.rpm"
RPM_HASH = "8ffa92d6bbff15911967d7d6d69eba1d13c5178c60f5a88c195321a890a7e3d438693e281f7e0ec42f5c6600080d539db2ef01ce7b8471b51c88b81635554fbe"

RPROVIDES:${PN} += "pkgconfig(portaudio-2.0) \
pkgconfig(portaudiocpp) \
portaudio-devel \
portaudio-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportaudio2 \
libportaudiocpp0 \
pkgconfig(alsa) \
pkgconfig(portaudio-2.0)"

inherit rpm
