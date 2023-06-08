SUMMARY = "A Python module for GUI automation that can control the keyboard and mouse"
DESCRIPTION = "PyAutoGUI is a GUI automation Python module. It can be used to \
programmatically control the mouse and keyboard."
LICENSE = "BSD-3-Clause"

PV = "0.9.53"

RPM_NAME = "python310-PyAutoGUI-0.9.53-1.3.noarch.rpm"
RPM_HASH = "8227dadf312e72c816cd89ed38e3ca782950c9e025a0cf6d58a18e5772b3631a601332e9f1e7530871d7ae8ebbff141c574f72a92000e00035997794add70c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyAutoGUI python3.10dist(pyautogui) python310-PyAutoGUI python3dist(pyautogui)"
RDEPENDS:${PN} += "python(abi) python310-Pillow python310-PyMsgBox python310-PyScreeze python310-PyTweening python310-python-xlib"

inherit rpm
