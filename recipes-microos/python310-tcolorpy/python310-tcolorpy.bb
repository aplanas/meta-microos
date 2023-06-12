SUMMARY = "Python library to apply true color for terminal text"
DESCRIPTION = "A Python library to apply true color for terminal text."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-tcolorpy-0.1.2-1.3.noarch.rpm"
RPM_HASH = "90ea70d03bc8056f6184f87f147b050b0d5bcf8c7943fb5740437c3d4f711d6d3fa7e1bb11b44054f178a2cad2b8e7cab6f628a2539259bc17d203f1c25e7f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tcolorpy \
python3.10dist(tcolorpy) \
python310-tcolorpy \
python3dist(tcolorpy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
