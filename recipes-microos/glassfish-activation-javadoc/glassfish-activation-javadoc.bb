SUMMARY = "Javadoc for glassfish-activation"
DESCRIPTION = "Javadoc for glassfish-activation."
LICENSE = "(BSD-3-Clause & GPL-2.0-only-WITH-Classpath-exception-2.0) | CDDL-1.1"

PV = "1.2.0"

RPM_NAME = "glassfish-activation-javadoc-1.2.0-4.3.noarch.rpm"
RPM_HASH = "f24cfbf7cab5e6cfbd8d9fd965b633920d80b35345f3ade100c960135052c15915fe7da525ad9bbbe8cb393774a6a90ed8e130c324ab5fc0d4af4d7321fd083a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-activation-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
