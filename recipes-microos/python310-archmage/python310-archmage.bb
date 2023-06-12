SUMMARY = "A reader and decompiler for files in the CHM format"
DESCRIPTION = "arCHMage is a reader and decompiler for files in the CHM format. This is \
the format used by Microsoft HTML Help, and is also known as Compiled HTML."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2.1"

RPM_NAME = "python310-archmage-0.4.2.1-3.1.noarch.rpm"
RPM_HASH = "6543bb0a6bd18db3514e157fc58fc339652cecda7a3b043cb391c663dafe6c2056c8c50d9ecbaef55fcda43c332f1c81dc9c234b664cf4a9027bcf447a25052a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-archmage \
python3.10dist(archmage) \
python310-archmage \
python3dist(archmage)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-beautifulsoup4 \
python310-pychm \
python310-sgmllib3k \
update-alternatives"

inherit rpm
