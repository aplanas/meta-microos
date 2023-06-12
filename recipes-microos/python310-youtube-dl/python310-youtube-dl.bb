SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python310-youtube-dl-2021.12.17-7.1.noarch.rpm"
RPM_HASH = "e4c5ee38292b9c28eaa2ea50c89b9ad88a3a60df9f925c1ec40e359f7d843fdf26549be4abdcf429312307af996da933df3322377fd67fc3c3cd77d4ed32e5bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-youtube-dl \
python3.10dist(youtube-dl) \
python310-youtube-dl \
python3dist(youtube-dl)"
RDEPENDS:${PN} += "ffmpeg \
python(abi) \
python310-xml"

inherit rpm
