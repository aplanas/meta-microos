SUMMARY = "Debian package related modules"
DESCRIPTION = "This is a collection of modules that are for dealing with Debian related \
data. Currently handled are: \
 \
* Debtags information (debian.debtags module) \
* debian/changelog (debian.changelog module) \
* Packages files, pdiffs (debian.debian_support module) \
* Control files of single or multiple RFC822-style paragraphs, e.g. \
  debian/control, .changes, .dsc, Packages, Sources, Release, etc. \
  (debian.deb822 module) \
* Raw .deb and .ar files, with (read-only) access to contained \
  files and meta-information"
LICENSE = "GPL-3.0-or-later"

PV = "0.1.49"

RPM_NAME = "python311-python-debian-0.1.49-1.3.noarch.rpm"
RPM_HASH = "a17329c2a5b7955c809ecc6029ee54222462982b15bf1529ac4f6db378f6272a7204780b028476abd0cee5d037785603fcf78e9f5ec8c4be89368fa5c2b1c1a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-debian) \
python311-debian \
python311-python-debian \
python3dist(python-debian)"
RDEPENDS:${PN} += "python(abi) \
python311-chardet \
python311-six \
zstd"

inherit rpm
