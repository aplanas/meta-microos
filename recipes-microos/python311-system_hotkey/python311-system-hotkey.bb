SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python311-system_hotkey-1.0.3-1.15.noarch.rpm"
RPM_HASH = "e03576b9d0e699f1ad74524de64f4b295c0441282cf8f33f0713eccde3595825b4621861e6a3ed982188cdea71da39eba29056b1680b74a63cf31a4cb602ec5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(system-hotkey) \
python311-system_hotkey \
python3dist(system-hotkey)"
RDEPENDS:${PN} += "python(abi) \
python311-xcffib \
python311-xpybutil"

inherit rpm
