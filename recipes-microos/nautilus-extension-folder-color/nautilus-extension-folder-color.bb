SUMMARY = "Nautilus extension for changing directory color"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "nautilus-extension-folder-color-0.0.88-2.8.noarch.rpm"
RPM_HASH = "8cd81a99b3c43a635c0d9b5585d35d2b59c2dd3050d1f626c547f5614afac011b41f1804e2691523eb2865430e0d336ab17e78931fce7bbe97d93d62d7f3164c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "folder-color-nautilus nautilus-extension-folder-color python3.10dist(folder-color-nautilus) python3dist(folder-color-nautilus)"
RDEPENDS:${PN} += "folder-color-common nautilus python3-nautilus"

inherit rpm
