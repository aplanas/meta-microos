SUMMARY = "Chinese Help System Data for GIMP"
DESCRIPTION = "GIMP-Help is a help system designed for use with the internal GIMP help \
browser, external Web browser and HTML renderers, and human eyeballs. \
 \
This package provides Chinese data for gimp-help."
LICENSE = "GFDL-1.2"

PV = "2.10.0"

RPM_NAME = "gimp-help-zh-2.10.0-2.5.noarch.rpm"
RPM_HASH = "e1921d0eac866cc768af76f5b4791a6b17551d3036c7c6ac2ed7a1f2e7798b5d2333f9e9273393a9bdf4b8188d28c4f07de8662634ff22afa57b1cb210c01dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-help-zh locale(gimp-help:zh)"
RDEPENDS:${PN} += "gimp-help"

inherit rpm
