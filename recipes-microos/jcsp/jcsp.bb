SUMMARY = "Communicating Sequential Processes for Java (JCSP)"
DESCRIPTION = "JCSP (Communication Sequential Processes for Java) is a \
library providing a concurrency model that is a combination \
of ideas from Hoare's CSP and Milner's pi-calculus. \
 \
Communicating Sequential Processes (CSP) is a mathematical \
theory for specifying and verifying complex patterns of \
behavior arising from interactions between concurrent \
objects. \
 \
JCSP provides a base range of CSP primitives plus a rich set of \
extensions. Also included is a package providing CSP process \
wrappers giving a channel interface to all Java AWT widgets \
and graphics operations.  It is extensively (java/documented) \
and includes much teaching. \
 \
JCSP is an alternative concurrency model to the threads and \
mechanisms built into Java. It is also compatible with \
it since it is implemented on top of it."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1~rc5"

RPM_NAME = "jcsp-1.1~rc5-3.10.noarch.rpm"
RPM_HASH = "9e7df633814f65ee7aa6807e97a668faa27a10587d89031ea7e1a3515356ca1604592b5a7a7b8398f3ab460a63972436fb5c92797231940535532c36b23ce350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcsp mvn(org.codehaus.jcsp:jcsp) mvn(org.codehaus.jcsp:jcsp:pom:) osgi(org.codehaus.jcsp)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(org.osgi:osgi.core)"

inherit rpm
