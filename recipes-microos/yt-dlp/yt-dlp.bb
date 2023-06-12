SUMMARY = "Enhanced fork of youtube-dl, a video site downloader for offline watching"
DESCRIPTION = "yt-dlp is a command-line program to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.03.04"

RPM_NAME = "yt-dlp-2023.03.04-2.1.noarch.rpm"
RPM_HASH = "20ac3c5f40f6cb07b82828d6b746a72b6c9feaeaa72b6774c195e098d7a5fdd81a5907f1a9cb852bdffe757aab29253a9f1e3957e3af918360ba2cd4220a04b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp"
RDEPENDS:${PN} += "/usr/bin/python3 ffmpeg python3"

inherit rpm
