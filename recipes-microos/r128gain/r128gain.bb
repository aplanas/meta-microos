SUMMARY = "Fast audio loudness (ReplayGain / R128) scanner & tagger"
DESCRIPTION = "Fast audio loudness (ReplayGain / R128) scanner & tagger."
LICENSE = "LGPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "r128gain-1.0.7-1.1.noarch.rpm"
RPM_HASH = "33fb3d3487766fb2a4d83bd62e9ead68a263d3013551b26dd59f92d54894c09b178507b35247a4666e3651d8ac66010f662c51f7975a4c471bb70391d362daa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(r128gain) python3dist(r128gain) r128gain"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-crcmod python3-ffmpeg-python python3-future python3-mutagen python3-tqdm"

inherit rpm
