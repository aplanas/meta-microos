SUMMARY = "Pentaho Flow Reporting Engine"
DESCRIPTION = "Pentaho Reporting Flow Engine is a free Java report library, formerly \
known as 'JFreeReport'"
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.4"

RPM_NAME = "pentaho-reporting-flow-engine-0.9.4-6.6.noarch.rpm"
RPM_HASH = "491520538f03bb6deb9c773ba9383edda92c202d1a16f2125ac50ee8445dbf44cb3851f62b1381b516a89a90941ca8e8c657dcb6a27ae276af3d004c195e1a02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-reporting-flow-engine"
RDEPENDS:${PN} += "flute java jpackage-utils libbase libfonts libformula liblayout librepository libserializer pentaho-libxml sac"

inherit rpm
