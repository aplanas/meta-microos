SUMMARY = "Text categorization library datafiles and documents"
DESCRIPTION = "The libexttextcat is a library implementing N-gram-based text categorization"
LICENSE = "BSD-4-Clause"

PV = "3.4.6"

RPM_NAME = "libexttextcat-3.4.6-1.3.aarch64.rpm"
RPM_HASH = "d334ea3ba15713a3af00aa540ccd471e0e665a19840831ce7f13d565dfe5cecc073ed75d086e60d29bd027a12c0860d17fdb5e7885760ff87c59b02bb8ffbd25"

RPROVIDES:${PN} += "libexttextcat libexttextcat(aarch-64) libtextcat"
RDEPENDS:${PN} += ""

inherit rpm
