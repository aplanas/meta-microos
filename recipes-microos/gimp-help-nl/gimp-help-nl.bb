SUMMARY = "Dutch Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Dutch data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-nl-2.10.0-2.5.noarch.rpm"
RPM_HASH = "2936ce659087a70020a759193ca4de215a53419b674d68553a88ac1e05059d099ab7947d8d2448eb472675a0d10580d3814ba626ad9124c1b621657bc12c46be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-nl locale(gimp-help:nl)"
RDEPENDS:${PN} += "gimp-help"

inherit rpm
