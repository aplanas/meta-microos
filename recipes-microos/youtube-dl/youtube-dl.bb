SUMMARY = "A tool for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a command-line program to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-2021.12.17-6.1.noarch.rpm"
RPM_HASH = "2894becd1abc189a36e1c1d1854ffa5af3da9ff9f5ea06c21181c65bc3c2d57a03b474619a0059738e8e960d3e6253a3e877afdcc9a685645859213c11e9d331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl"
RDEPENDS:${PN} += "/usr/bin/python3 ffmpeg python3 python3-xml"

inherit rpm
