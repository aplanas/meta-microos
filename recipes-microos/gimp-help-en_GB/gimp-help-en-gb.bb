SUMMARY = "British English Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides British English data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-en_GB-2.10.0-2.5.noarch.rpm"
RPM_HASH = "f5c5bf0472de6a971a14b1a33a8e4992857bd88d7f08bc11e179a772ee996478bfa06af4430cf552ec2bd903a9292668f51d56a2d69386b54bc743c432af3bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-en_GB locale(gimp-help:en_GB)"
RDEPENDS:${PN} += "gimp-help"

inherit rpm
