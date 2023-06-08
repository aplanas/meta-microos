SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python311-system-hotkey310-1.0.5-1.3.noarch.rpm"
RPM_HASH = "4d85d27dff3cabd84d7f39c18bb990cd9928031060b075f0bbcbcbedbce806743aa36b1e9a0042b835ad41daa5da83444a5612548d3d14796bf92ce0d98bd9a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(system-hotkey310) python311-system-hotkey310 python3dist(system-hotkey310)"
RDEPENDS:${PN} += "python(abi) python311-xcffib python311-xpybutil"

inherit rpm
