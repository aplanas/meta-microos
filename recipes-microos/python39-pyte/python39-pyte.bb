SUMMARY = "VTXXX-compatible linux terminal emulator"
DESCRIPTION = "An in-memory VTXXX-compatible terminal emulator supporting VT100 and \
other DEC VTs between 1970 and 1995. pyte can be used to: \
 \
* screen scrape terminal apps, for example htop or aptitude. \
* write terminal emulators; either with a graphical (xterm, rxvt) \
  or a web interface, like AjaxTerm."
LICENSE = "LGPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "python39-pyte-0.8.1-1.3.noarch.rpm"
RPM_HASH = "76ed0bc3e5edb5810ffa537500bc05b43d776cbae5ac673b0e2765c86a3031e1a096c60ced27fb2d4878ecda17a6003224da720034cfe56e5d1aca66407d98f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyte) \
python39-pyte \
python3dist(pyte)"
RDEPENDS:${PN} += "python(abi) \
python39-wcwidth"

inherit rpm
