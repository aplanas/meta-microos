SUMMARY = "Python package to play and record audio"
DESCRIPTION = "SoundCard is a library for playing and recording audio without \
resorting to a CPython extension. Instead, it is implemented using \
CFFI and the native audio libraries of Linux, Windows and macOS. \
 \
SoundCard is cross-platform, and supports Linux/pulseaudio, \
Mac/coreaudio, and Windows/WASAPI. While the interface is identical \
across platforms, naming schemes and block sizes can vary between \
devices and platforms."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "python311-SoundCard-0.4.2-1.3.noarch.rpm"
RPM_HASH = "7876c48be9628038c8b119ff1561beaa4786cb6ae69133cda7707a2aebc2932e241941b55253a5e50a4a343fb69f74a910758a0417a26990d65e807716e2f2d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(soundcard) \
python311-SoundCard \
python3dist(soundcard)"
RDEPENDS:${PN} += "pulseaudio-daemon \
python(abi) \
python311-cffi \
python311-numpy"

inherit rpm
