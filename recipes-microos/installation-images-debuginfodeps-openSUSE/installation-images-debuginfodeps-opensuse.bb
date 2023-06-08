SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.86"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.86-1.29.aarch64.rpm"
RPM_HASH = "d54097d291f2d21c69dcdfa5dda89b2390b201d45ba185462479229cde68eab99c5235fccbf3a04a007e8bd1cd00ac2401f8ab131a48b5ae26e1ab4e74f0284c"

RPROVIDES:${PN} += "debuginfo(build-id) installation-images-debuginfodeps installation-images-debuginfodeps-openSUSE installation-images-debuginfodeps-openSUSE(aarch-64)"
RDEPENDS:${PN} += "debuginfo(build-id)"

inherit rpm
