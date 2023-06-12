SUMMARY = "A tool for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a command-line program to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "youtube-dl-2021.12.17-7.1.noarch.rpm"
RPM_HASH = "d6035f8b7bc14fc3cffdaa8250f71337bb2beb3c37a8dcc4513522860a18c68db9aaf6fbe281c59f3d4b2115affc0db52293a625eb47d6c9854577100f0fecce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl"
RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpeg \
python3 \
python3-xml"

inherit rpm
