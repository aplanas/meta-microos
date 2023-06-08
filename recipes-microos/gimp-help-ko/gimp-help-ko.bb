SUMMARY = "Korean Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Korean data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-ko-2.10.0-2.5.noarch.rpm"
RPM_HASH = "3007afc632721e88b34efd131d1383abf36449987a4f206163ff2b66dbd58f00d82075ae853b0b349fcaa8bf2a2caea296bffcaeefe3bd65c32076a34a8f9751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-ko locale(gimp-help:ko)"
RDEPENDS:${PN} += "gimp-help"

inherit rpm
