SUMMARY = "Suite of Tools and Libraries for Manipulating Fonts"
DESCRIPTION = "FontTools is a suite of tools and libraries for manipulating fonts \
written in Python. \
 \
It currently reads and writes TrueType font files, reads PostScript \
Type 1 fonts, and more. It contains two command line programs to \
convert TrueType fonts to an XML based format (called TTX) and back."
LICENSE = "MIT & OFL-1.1"

PV = "4.39.3"

RPM_NAME = "python39-FontTools-4.39.3-2.1.noarch.rpm"
RPM_HASH = "79e40ceff7c371db243e1b8a67d223af15766b579c108289972edc8baf732b9ed767aa098705d63718d8fa8c55514429d4abbe9079723691addff06e15afd5f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fonttools) \
python39-FontTools \
python39-fonttools \
python3dist(fonttools)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-fs \
update-alternatives"

inherit rpm
