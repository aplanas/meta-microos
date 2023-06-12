SUMMARY = "Javadoc for qdox"
DESCRIPTION = "API docs for qdox."
LICENSE = "Apache-2.0"

PV = "2.0.3"

RPM_NAME = "qdox-javadoc-2.0.3-1.1.noarch.rpm"
RPM_HASH = "ff0feb797527d6a5be4728167d3b5e07155887b7aeb39500bc78a50ae5edf135081dcec43de894598337243f3b1ab153d81933b34bd840ffe8b64405b3ffee1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qdox-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
