SUMMARY = "Fabric Manager Graphical User Interface"
DESCRIPTION = "FMGUI is the Fabric Manager Graphical User Interface.  It can be run by invoking the Bash \
script fmgui."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "10.1.0.0.115"

RPM_NAME = "opa-fmgui-10.1.0.0.115-7.6.noarch.rpm"
RPM_HASH = "fcc4153d31f6fde2a39a114f47a58ca874da12c553d661a5a9124b7ce4c9937172176a712e359922ce4c8533bfb72642a1fca759252caf99d7095d33c853534a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(fmgui.desktop) config(opa-fmgui) opa-fmgui"
RDEPENDS:${PN} += "/bin/bash /bin/sh jre mlocate"

inherit rpm
