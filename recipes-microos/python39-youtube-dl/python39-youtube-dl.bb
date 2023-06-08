SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python39-youtube-dl-2021.12.17-6.1.noarch.rpm"
RPM_HASH = "739f5830a52ed7b5a51428ea19fb656b5f8758e1c0be422d6c2c91b99f11bbeb833267e5709f2d0c510732ff9a45a53f20001673c91ebe238b4f676400fade54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(youtube-dl) python39-youtube-dl python3dist(youtube-dl)"
RDEPENDS:${PN} += "ffmpeg python(abi) python39-xml"

inherit rpm
