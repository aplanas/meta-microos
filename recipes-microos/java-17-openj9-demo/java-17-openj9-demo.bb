SUMMARY = "OpenJDK 17 Demos"
DESCRIPTION = "The OpenJDK 17 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.6.0"

RPM_NAME = "java-17-openj9-demo-17.0.6.0-2.1.aarch64.rpm"
RPM_HASH = "83e25b8ec3f4b54890579a42790298af907b616ef304a13d289c9ce67b96743f3dee2d93810ffc4c3761b305af24279c0d660b1063b8521f7d4ed7715b38bb04"

RPROVIDES:${PN} += "java-17-openj9-demo java-17-openj9-demo(aarch-64)"
RDEPENDS:${PN} += "java-17-openj9"

inherit rpm
