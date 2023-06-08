SUMMARY = "Smart replacement for plain tuple used in __version__"
DESCRIPTION = "Smart replacement for plain tuple used in __version__. \
 \
* Keep a *single version definition* inside your package or module \
* Get proper versioning of development snapshots coupled with your \
  Version Control System (pluggable support for additional systems \
  available) \
* Produce nice version strings for released files that are compliant \
  with PEP 386 \
* Remain comparable as tuple of integers"
LICENSE = "LGPL-3.0-or-later"

PV = "1.9.1"

RPM_NAME = "python310-versiontools-1.9.1-14.17.noarch.rpm"
RPM_HASH = "68f20d2145da51d6269760fc7324567af62274c55184715235b619111a899025406364a240a875fb6fa4a167e51f9418b4c446a6cb7585f2d142bcf15d1c7087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versiontools python3.10dist(versiontools) python310-versiontools python3dist(versiontools)"
RDEPENDS:${PN} += "python(abi) python310-setuptools"

inherit rpm
