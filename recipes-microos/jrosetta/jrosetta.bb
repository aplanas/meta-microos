SUMMARY = "API and graphical components for console"
DESCRIPTION = "JRosetta provides a common base for graphical component that could be used \
to build a graphical console in Swing with the latest requirements, such as \
command history, completion and so on for instance for scripting language \
or command line."
LICENSE = "GPL-2.0"

PV = "1.0.4"

RPM_NAME = "jrosetta-1.0.4-5.21.noarch.rpm"
RPM_HASH = "e995c224bd980117f6b2ca06267968f6b420d84660501dc00ffc2e71cb0ec6f3291f3bba759e06aeae343a0bcf9b24738cc5663c066ee7d739afe285b6664550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jrosetta"
RDEPENDS:${PN} += "java jpackage-utils"

inherit rpm
