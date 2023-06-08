SUMMARY = "Romanian Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Romanian data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-ro-2.10.0-2.5.noarch.rpm"
RPM_HASH = "c8180c483b5baf407c31e5f0c76e16f2c33dfb24691b8d56acf7e2757c0975b425531600d61dfc731ada8213f26329f3e57dcfa69fa1af26067b7856016c2fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-ro locale(gimp-help:ro)"
RDEPENDS:${PN} += "gimp-help"

inherit rpm
