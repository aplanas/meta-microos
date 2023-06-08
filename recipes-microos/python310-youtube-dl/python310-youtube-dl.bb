SUMMARY = "A Python module for downloading from video sites for offline watching"
DESCRIPTION = "youtube-dl is a python module to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2021.12.17"

RPM_NAME = "python310-youtube-dl-2021.12.17-6.1.noarch.rpm"
RPM_HASH = "887b2fe1597675872fbe5e4f1c579a841cda2621d8f6cd98d8a1a8dcb707ecb2a31c3faecaf9ef9d142cc8cb89d0c54b320c0d13cf54c03db4ebf8e744a8b495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-youtube-dl python3.10dist(youtube-dl) python310-youtube-dl python3dist(youtube-dl)"
RDEPENDS:${PN} += "ffmpeg python(abi) python310-xml"

inherit rpm
