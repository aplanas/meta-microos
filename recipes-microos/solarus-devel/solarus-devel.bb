SUMMARY = "Development files for solarus"
DESCRIPTION = "Development files for Solarus, including header files."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-devel-1.6.5-2.15.aarch64.rpm"
RPM_HASH = "70e70ce3d8532ea7389b5ba73dfa9173896e3744cc6c75a941d8bb5165bb4fd0c4e68fd487996af6614e2df94e7a5c2c230268df0bf71fd9af16083616b1fc08"

RPROVIDES:${PN} += "solarus-devel solarus-devel(aarch-64)"
RDEPENDS:${PN} += "solarus solarus-gui"

inherit rpm
