SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python39-system_hotkey-1.0.3-1.15.noarch.rpm"
RPM_HASH = "1b54b2713b11cefe752e2ac8632553a8b8bd039154669f262cb00940aea9e7d8aa02bd197302a75d320060a563b2a15a25d654584b7731d32d04d2d566cbca9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(system-hotkey) python39-system_hotkey python3dist(system-hotkey)"
RDEPENDS:${PN} += "python(abi) python39-xcffib python39-xpybutil"

inherit rpm
