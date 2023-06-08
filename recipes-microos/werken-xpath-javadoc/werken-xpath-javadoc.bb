SUMMARY = "Javadoc for werken-xpath"
DESCRIPTION = "werken.xpath is an implementation of the W3C XPath Recommendation, on \
top of the JDOM library.  It takes as input a XPath expression, and a \
JDOM tree, and returns a NodeSet (java.util.List) of selected \
elements.  Is is being used in the development of the \
as-yet-unreleased werken.xslt (eXtensible Stylesheet Language) and the \
werken.canonical (XML canonicalization) packages."
LICENSE = "Apache-1.1"

PV = "0.9.4"

RPM_NAME = "werken-xpath-javadoc-0.9.4-28.6.noarch.rpm"
RPM_HASH = "68a5da66a981f1dbfd3fb40dfb6e2366eb5cd380036a07bb6dd1b06b0dd920b8f59db3ec3d1dded01c80bd6f555fd589662b883eb79a30532ec7c9f05f7e9c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "werken-xpath-javadoc werken.xpath-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
