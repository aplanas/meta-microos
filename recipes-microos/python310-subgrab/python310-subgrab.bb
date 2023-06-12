SUMMARY = "Script to download subtitles for media files"
DESCRIPTION = "A script that allows to download subtitles for TV-Series, Anime and Movies from \
subscene and other sites."
LICENSE = "GPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "python310-subgrab-1.0.4-1.17.noarch.rpm"
RPM_HASH = "fbc4a509365dbcf41299c0cc83c124191b9fff77393d4f8bb8d0a2e892a8872b3916792790b00ab2a3111bc8ef2a1ff55f62db191e4b564144d6161a2c780502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subgrab \
python3.10dist(subgrab) \
python310-subgrab \
python3dist(subgrab)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-beautifulsoup4 \
python310-lxml \
python310-requests \
update-alternatives"

inherit rpm
