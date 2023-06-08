SUMMARY = "Tool to introduce controlled degradations to audio"
DESCRIPTION = "Audio degradation toolbox in python. It is used to apply controlled \
degradations to audio."
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python310-audio-degrader-1.3.1-1.10.noarch.rpm"
RPM_HASH = "52e25c7fcef5d9237b9514dce9718911c8e0a60fcc5f9698d46f436f5ed3871c4bd74798be001039dfd33564e59af2b38a0bc0a9b1ed0c0b27727424454a4c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audio-degrader python3.10dist(audio-degrader) python310-audio-degrader python3dist(audio-degrader)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-SoundFile python310-scipy python310-sox update-alternatives"

inherit rpm
