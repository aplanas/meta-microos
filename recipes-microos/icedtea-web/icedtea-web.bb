SUMMARY = "Java Web Start implementation"
DESCRIPTION = "The IcedTea-Web project provides a Free Software web browser plugin running \
applets written in the Java programming language and an implementation of Java \
Web Start, originally based on the NetX project."
LICENSE = "GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.8.8"

RPM_NAME = "icedtea-web-1.8.8-1.10.aarch64.rpm"
RPM_HASH = "b2ff2de3fa34ffff595086fccb6f4b65738608f562980718882ec15cc2761dbfc40199f8127cf50a910234063d71402893f93aee18c3002d885c1f5caa0865be"

RPROVIDES:${PN} += "application() application(itweb-settings.desktop) application(javaws.desktop) application(policyeditor.desktop) icedtea-web icedtea-web(aarch-64) java-1_6_0-openjdk-plugin java-1_7_0-openjdk-plugin java-1_8_0-openjdk-plugin java-1_9_0-openjdk-plugin java-plugin mimehandler(application/x-java-jnlp-file) mimehandler(x-scheme-handler/jnlp) mimehandler(x-scheme-handler/jnlps)"
RDEPENDS:${PN} += "/bin/bash /bin/sh java rhino tagsoup update-alternatives"

inherit rpm
