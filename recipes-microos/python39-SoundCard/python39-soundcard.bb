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

RPM_NAME = "python39-SoundCard-0.4.2-1.3.noarch.rpm"
RPM_HASH = "bea4a9366240df8fceb3632b04ae7f31049636c38a625d2258614c605e2b8544c513c0b4a8be14a91ff95a57f8a7c24e68d4ff30a0d3367251a1a21e39dfcd37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(soundcard) python39-SoundCard python3dist(soundcard)"
RDEPENDS:${PN} += "pulseaudio-daemon python(abi) python39-cffi python39-numpy"

inherit rpm
