SUMMARY = "VTXXX-compatible linux terminal emulator"
DESCRIPTION = "An in-memory VTXXX-compatible terminal emulator supporting VT100 and \
other DEC VTs between 1970 and 1995. pyte can be used to: \
 \
* screen scrape terminal apps, for example htop or aptitude. \
* write terminal emulators; either with a graphical (xterm, rxvt) \
  or a web interface, like AjaxTerm."
LICENSE = "LGPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "python311-pyte-0.8.1-1.3.noarch.rpm"
RPM_HASH = "0a8a52c6c7da107771514f90dbc06762af719172b2aacf2126792c3d179dd7f94fbb29554402395c2629c896fb8d18a0d4df65110d6f462be40f06306a4a140e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyte) \
python311-pyte \
python3dist(pyte)"
RDEPENDS:${PN} += "python(abi) \
python311-wcwidth"

inherit rpm
