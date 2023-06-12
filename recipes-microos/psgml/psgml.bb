SUMMARY = "Emacs Add-On to edit SGML/XML documents"
DESCRIPTION = "'psgml' supports you while editing SGML/XML documents.	It respects the \
context of the used DTD (Document Type Definition) and offers the valid \
elements and attributes. \
 \
Included are several helper tools: tdtd, xxml, psgml-xpointer. \
 \
For more info see README.openSUSE. \
 \
Compiled for GNU Emacs (XEmacs has its own version!). \
 \
 \
 \
Authors: \
-------- \
    James Clark <jjc@clark.com> \
    Lennart Staflin <lenst@lysator.liu.se> \
    David Megginson <dmeggins@sprynet.com> \
    Matthias Clasen <mclasen@sun2.mathematik.uni-freiburg.de> \
    François Pinard <pinard@iro.umontreal.ca> \
    etc."
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.4.1"

RPM_NAME = "psgml-1.4.1-5.11.noarch.rpm"
RPM_HASH = "e54d46709cf3e9063e74aa6e1f616f7cacf87f273986751464a21134ff307c2145999819ac185482bfc783991f6e2721bba08be3ce7f03f083c64911ef2c2349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "psgml"
RDEPENDS:${PN} += "/bin/sh \
emacs_program"

inherit rpm
