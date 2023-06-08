SUMMARY = "Java port of Mozilla's automatic character set detection algorithm"
DESCRIPTION = "jchardet is a java port of the source from Mozilla's automatic charset \
detection algorithm. The original author is Frank Tang. What is available \
here is the java port of that code. The original source in C++ can be found \
from http://lxr.mozilla.org/mozilla/source/intl/chardet/. More information can \
be found at http://www.mozilla.org/projects/intl/chardet.html."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "jchardet-1.1-2.6.noarch.rpm"
RPM_HASH = "608ca752d75f6b26cf7d560e9fd288a3ac2fd3cbb15e6276ad237dff7dd0598c679ef5d3b3918edc3bb06d997afa421aca8c31f9d91ae19f7558f6d03ca51d13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jchardet mvn(net.sourceforge.jchardet:jchardet) mvn(net.sourceforge.jchardet:jchardet:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
