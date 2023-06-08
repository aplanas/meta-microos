SUMMARY = "Enhanced fork of youtube-dl, a video site downloader for offline watching"
DESCRIPTION = "yt-dlp is a command-line program to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2023.03.04"

RPM_NAME = "yt-dlp-2023.03.04-1.1.noarch.rpm"
RPM_HASH = "4ceefbb4ea0e90fb7d40d371063ecf17593b5ddb409f61b046b5869c9ca5a8dc45429154596c2e4e8d6b48660a1e5b762f37e0eb104d0a24b763c7a217a2c3ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp"
RDEPENDS:${PN} += "/usr/bin/python3 ffmpeg python3"

inherit rpm
