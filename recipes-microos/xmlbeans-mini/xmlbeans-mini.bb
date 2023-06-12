SUMMARY = "XML-Java binding tool"
DESCRIPTION = "XMLBeans is an XML-Java binding tool that allows accessing XML in a \
Java-typical way. The features of XML and XML Schema are mapped to \
the equivalent Java language and typing constructs. XMLBeans uses XML \
Schema to compile Java interfaces and classes that can then be used \
to access and modify XML instance data. XMLBeans is similar to other \
Java interface/class, with a number of getFoo or setFoo methods. \
There are also APIs that allow you access to the full XML infoset as \
well so as to allow you to reflect into the XML schema itself through \
an XML Schema Object model."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "xmlbeans-mini-2.6.0-13.1.noarch.rpm"
RPM_HASH = "64d99d3ca575663923b9e4043a147d7c07c6077846c15f4c0090a7bde4a74a463e658c4aa76b915dd0d3e9f04de1c52bc1d1bebb8eeb06f92bb221b482bc029e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlbeans \
xmlbeans-mini"
RDEPENDS:${PN} += ""

inherit rpm
