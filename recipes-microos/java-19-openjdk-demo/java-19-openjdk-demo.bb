SUMMARY = "OpenJDK 19 Demos"
DESCRIPTION = "The OpenJDK 19 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "19.0.2.0"

RPM_NAME = "java-19-openjdk-demo-19.0.2.0-3.3.aarch64.rpm"
RPM_HASH = "b72f9caa3191748916ba93248cc8007619decb981d2add72b2d4932c955c79aaceb360653cdafafbe4a3c3b88db121e6685c02b2ebc672a7c179b0998d2ab715"

RPROVIDES:${PN} += "java-19-openjdk-demo java-19-openjdk-demo(aarch-64)"
RDEPENDS:${PN} += "java-19-openjdk"

inherit rpm
