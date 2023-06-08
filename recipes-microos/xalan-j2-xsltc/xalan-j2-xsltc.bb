SUMMARY = "Java XSLT compiler"
DESCRIPTION = "The XSLT Compiler is a Java-based tool for compiling XSLT stylesheets \
into lightweight and portable Java byte codes called translets."
LICENSE = "Apache-2.0"

PV = "2.7.2"

RPM_NAME = "xalan-j2-xsltc-2.7.2-12.6.noarch.rpm"
RPM_HASH = "9c272dd88a9d5e3d3abcca6e52586d141b156bc0d97777d63cf49a226746e71815230204647eccf9982353ca33cc7a84175d13915793d7ae176e47900b3174e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(xalan:xsltc) mvn(xalan:xsltc:pom:) xalan-j2-xsltc"
RDEPENDS:${PN} += "bcel java-headless java_cup javapackages-filesystem jaxp_parser_impl jlex mvn(xalan:xalan) regexp"

inherit rpm
