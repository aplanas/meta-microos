SUMMARY = "A reader and decompiler for files in the CHM format"
DESCRIPTION = "arCHMage is a reader and decompiler for files in the CHM format. This is \
the format used by Microsoft HTML Help, and is also known as Compiled HTML."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.2.1"

RPM_NAME = "python311-archmage-0.4.2.1-2.9.noarch.rpm"
RPM_HASH = "e08165531021bfbaa4d36ecbcfe31691fa10a09b53db60cdac1f4bcdb4cc1aa9e0d6a8945e2baf4112aa152e7af6a4e770c06a10f3dab3782c8a77362292a904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(archmage) python311-archmage python3dist(archmage)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python3-beautifulsoup4 python3-pychm python3-setuptools python3-sgmllib3k update-alternatives"

inherit rpm
