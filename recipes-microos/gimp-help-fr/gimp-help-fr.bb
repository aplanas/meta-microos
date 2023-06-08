SUMMARY = "French Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides French data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-fr-2.10.0-2.5.noarch.rpm"
RPM_HASH = "d1e89efc3290d10f7e95f0900266665ace066cbcda92002158a99cdba8630c858cf9e88ce4c067668bdba1f78731ec6154807a957967408187a8f841210d4013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-fr locale(gimp-help:fr)"
RDEPENDS:${PN} += "gimp-help"

inherit rpm
