SUMMARY = "Python library for i3 WM extensions"
DESCRIPTION = "python-i3ipc is a Python library for controlling the i3 window manager which \
aims to be used by scripts and applications which interact with the window \
manager like status line generators, notification daemons and pagers. \
 \
This library uses i3’s interprocess communication, which is the interface \
that i3 WM uses to receive commands from client applications such as i3-msg. It \
also features a publish/subscribe mechanism for notifying interested parties of \
window manager events."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python39-i3ipc-2.2.1-4.7.noarch.rpm"
RPM_HASH = "d0fab740cccc04536ef93dd124068024c4930dac6d49e33024f6e75de86174a360e34230fad281d2abb201faec7b1a5c69f7cc4f57e8a9cb3c05db6dd704e72d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(i3ipc) python39-i3ipc python3dist(i3ipc)"
RDEPENDS:${PN} += "python(abi) python39-python-xlib"

inherit rpm
