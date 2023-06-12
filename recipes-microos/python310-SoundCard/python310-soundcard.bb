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

RPM_NAME = "python310-SoundCard-0.4.2-1.3.noarch.rpm"
RPM_HASH = "19e3817e0bb0788fb928159f33944222567d690f2aa50990657da438b8662091e7ec2a673f2310ee74037dafbe5c7ff48d3e910660ca5bb285ff9ce3c7d9abaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SoundCard \
python3.10dist(soundcard) \
python310-SoundCard \
python3dist(soundcard)"
RDEPENDS:${PN} += "pulseaudio-daemon \
python(abi) \
python310-cffi \
python310-numpy"

inherit rpm
