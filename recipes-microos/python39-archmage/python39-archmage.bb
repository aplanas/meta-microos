SUMMARY = "A reader and decompiler for files in the CHM format"
DESCRIPTION = "arCHMage is a reader and decompiler for files in the CHM format. This is \
the format used by Microsoft HTML Help, and is also known as Compiled HTML."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2.1"

RPM_NAME = "python39-archmage-0.4.2.1-2.9.noarch.rpm"
RPM_HASH = "6e1d9dae5c7d4214b822f4c3a484b7fe2a8a756eb79e75b2d3a24a9351d714ff3b45870015e7e8785f0303d37d42d952d7bbbb8eb85b427c5f169128b7dcb702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(archmage) python39-archmage python3dist(archmage)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python3-beautifulsoup4 python3-pychm python3-setuptools python3-sgmllib3k update-alternatives"

inherit rpm
