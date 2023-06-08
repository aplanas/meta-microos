SUMMARY = "An OBS source service: Update spec file version"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
Very simply script to update the version in .spec or .dsc files according to \
a given version or to the existing files."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.2"

RPM_NAME = "obs-service-set_version-0.6.2-1.2.noarch.rpm"
RPM_HASH = "4003bbfb7670c29fd6e808422495821d54806d02fee349f98024430d67bf9f75ae3d5d79645f5bc89f36ac369b2e9703075a2e2e65d455cc6f24797ffa3736d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-set_version"
RDEPENDS:${PN} += "/usr/bin/python3 python3-base"

inherit rpm
