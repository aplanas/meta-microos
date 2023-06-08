SUMMARY = "Full Java CommAPI implementation"
DESCRIPTION = "RxTx is a Java library, using a native implementation (via JNI), providing serial \
and parallel communication for the Java Development Toolkit (JDK). It is based on \
the specification for Sun's Java Communications API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2~pre2"

RPM_NAME = "rxtx-java-2.2~pre2-4.3.aarch64.rpm"
RPM_HASH = "78234baafeb85e732af6f1c029046b2393b20026f7daee0de70505fd79a2a617fa8d13d2eb6b212e944c5e85f9c891ce972958e50ebc2a7eb0d128dc73172fb0"

RPROVIDES:${PN} += "osgi(gnu.io.rxtx) rxtx-java rxtx-java(aarch-64)"
RDEPENDS:${PN} += "librxtx2"

inherit rpm
