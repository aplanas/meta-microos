SUMMARY = "Java library for accessing non-private method's parameter names at run-time"
DESCRIPTION = "Paranamer is a Java library that allows the parameter names of non-private \
methods and constructors to be accessed at run-time. Most compilers discard \
this information; traditional Reflection on JDK <= 7 would show something like \
doSomething(mypackage.Person ???) instead of doSomething(mypackage.Person toMe). \
The Paranamer library fills this gap for these JDK versions."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-2.8-2.10.noarch.rpm"
RPM_HASH = "8505b27763f5219e2487956f0f4b3146d15435f350b077d1998a8e34b450d833e45be67fa923af210a419ce7d25e53fe1ead781de3382c61bd29bc90bbf6deb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.thoughtworks.paranamer:paranamer) mvn(com.thoughtworks.paranamer:paranamer:pom:) osgi(com.thoughtworks.paranamer) paranamer"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
