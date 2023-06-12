SUMMARY = "Python package providing assets pygaljs"
DESCRIPTION = "Python package providing assets from https://github.com/Kozea/pygal.js"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python311-pygaljs-1.0.2-2.1.noarch.rpm"
RPM_HASH = "cf7fcb359eccd86a80c08117354daea0f6abb2f656501abe0bcad2c32bdad734340695a2e65b5a9cdcbd2013bbd9991ede135118554ab27b8e6e4fc36ecefcf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pygaljs) \
python311-pygaljs \
python3dist(pygaljs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
