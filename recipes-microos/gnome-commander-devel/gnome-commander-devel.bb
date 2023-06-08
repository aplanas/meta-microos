SUMMARY = "Development files for gnome-commander"
DESCRIPTION = "Development files for gnome-commander."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.0"

RPM_NAME = "gnome-commander-devel-1.16.0-2.3.aarch64.rpm"
RPM_HASH = "d9ed749447355dbbbad761f265a4cc300515d4bfdab8e8935ca694248d2cb0e07bb3481ba95d60f0791f1e0a2c3814bdae13402fffe162c8b308d3f051a27aab"

RPROVIDES:${PN} += "gnome-commander-devel gnome-commander-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
