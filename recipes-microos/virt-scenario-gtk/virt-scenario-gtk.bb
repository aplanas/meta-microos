SUMMARY = "Gtk interface virt-scenario"
DESCRIPTION = "This is the Gtk interface for virt-scenario."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "virt-scenario-gtk-2.0.4-1.1.noarch.rpm"
RPM_HASH = "eb6b3b2ad8bfbd19540ceab8a25313d4b721151b72ce12b0e9740ed758de04a33f740941c2854d9259bd90b8e911d8fe13f6e07d176ebe61c892e5bedfeda31d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-scenario-gtk"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) virt-scenario"

inherit rpm
