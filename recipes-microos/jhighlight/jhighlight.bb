SUMMARY = "An embeddable pure Java syntax highlighting library"
DESCRIPTION = "JHighlight is an embeddable pure Java syntax highlighting library that supports \
Java, Groovy, C++, HTML, XHTML, XML and LZX languages and outputs to XHTML. It \
also supports RIFE (http://rifers.org) templates tags and highlights them \
clearly so that you can easily identify the difference between your RIFE markup \
and the actual marked up source."
LICENSE = "CDDL-1.0 | LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "jhighlight-1.0.1-2.10.noarch.rpm"
RPM_HASH = "d4caa7d7dd767f8b43df46933ba2e9dd29ee227b4c78fb9ea998d5acfd2a8c2faf236650dccc34e78e1f3d2e12787d6ca375233230790fdebd78230250ca7a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jhighlight mvn(com.uwyn:jhighlight) mvn(com.uwyn:jhighlight:pom:) mvn(org.codelibs:jhighlight) mvn(org.codelibs:jhighlight:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
