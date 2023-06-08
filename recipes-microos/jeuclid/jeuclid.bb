SUMMARY = "MathML rendering solution"
DESCRIPTION = "JEuclid is a complete MathML rendering solution, consisting of: \
 \
    A MathViewer application \
    Command line converters from MathML to other formats \
    An ant task for automated conversion \
    Display components for AWT, Swing, and SWT \
 \
JEuclid features: \
 \
    Almost complete support for presentation MathML 2.0 \
    Basic support for content MathML 2.0 \
    Initial support for the upcoming MathML 3.0 \
 \
This pacakges contains the core module containing basic JEuclid \
rendering and document handling classes."
LICENSE = "Apache-2.0 & LGPL-2.1-only"

PV = "3.1.9"

RPM_NAME = "jeuclid-3.1.9-2.6.noarch.rpm"
RPM_HASH = "77f7a3cde86d28a3918748fb8dd39f54336675426be9fbebba12d6877c8f713127f6d966af747eea3c06b3cfbd828b5ac23eb80f2d733b7fdf2383e89e3bfa9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeuclid"
RDEPENDS:${PN} += "/bin/sh apache-commons-logging batik java javapackages-tools jcip-annotations xmlgraphics-commons"

inherit rpm
