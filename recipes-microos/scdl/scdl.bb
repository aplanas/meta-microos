SUMMARY = "Souncloud Music Downloader"
DESCRIPTION = "The program can download music from SoundCloud and set id3tag to the downloaded music."
LICENSE = "GPL-2.0-only"

PV = "2.7.3"

RPM_NAME = "scdl-2.7.3-1.2.noarch.rpm"
RPM_HASH = "eb9b7e1be91cbac3baf79e6d098237ab65cbbe1fb55a8da6c994bdf8d7373d5046ebc59f0818230745be43235dbdaa5622db73cf6d6fc47bf37e52ddc68be4ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(scdl) \
python3dist(scdl) \
scdl"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-clint \
python3-docopt \
python3-mutagen \
python3-requests \
python3-termcolor"

inherit rpm
