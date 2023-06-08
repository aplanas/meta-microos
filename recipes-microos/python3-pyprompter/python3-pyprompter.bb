SUMMARY = "Intelligent predictive wxPython text editor"
DESCRIPTION = "This package contains the wxPython predictive text editor pyprompter. \
 \
pyprompter is a cross-platform predictive text editor. \
 \
pyprompter displays predictions in a contextual pop-up box as each letter is typed. Predictions can be easily selected and inserted in the document."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-pyprompter-0.9.1-12.10.noarch.rpm"
RPM_HASH = "714c6a83dcf17296c77bf95a4df361e9ff3d887722980f11ebff54a9173869cb60886b5c9bdacccc9bc790081006b8c265cb0480c44d04cf86f4dcfd252929c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(pyprompter.desktop) pyprompter python3-pyprompter python3.10dist(pyprompter) python3dist(pyprompter)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-presage python3-wxPython"

inherit rpm
