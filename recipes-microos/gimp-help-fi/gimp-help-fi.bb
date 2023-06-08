SUMMARY = "Finnish Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Finnish data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-fi-2.10.0-2.5.noarch.rpm"
RPM_HASH = "f1e09bc9bd3939fa218a602419b217821a551750a81ac6d33a4446e6ac69046bc53ef216753303ecaeb02129809f2b4ce2645bb69f162381427452c2c191fe24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-fi locale(gimp-help:fi)"
RDEPENDS:${PN} += "gimp-help"

inherit rpm
