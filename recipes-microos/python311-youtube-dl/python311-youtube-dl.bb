SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python311-youtube-dl-2021.12.17-6.1.noarch.rpm"
RPM_HASH = "7ac817a9895f40985d5b8ef9da1b3683a01f1a419cb9fe250083e45f86a927e61b46e2f5b7d8285235116c5c2732f6f912000241f2c2e9ee61a1ab65a55c7a18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(youtube-dl) python311-youtube-dl python3dist(youtube-dl)"
RDEPENDS:${PN} += "ffmpeg python(abi) python311-xml"

inherit rpm
