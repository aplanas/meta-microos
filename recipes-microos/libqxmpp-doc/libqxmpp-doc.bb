SUMMARY = "Qxmpp library documentation"
DESCRIPTION = "This packages provides documentation of Qxmpp library API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.3"

RPM_NAME = "libqxmpp-doc-1.5.3-1.3.noarch.rpm"
RPM_HASH = "ffe76cdc43fe108a14ed2be7c92015864d6740382c3d66c59671d3050e35dffab1566da1aaa703e9806a1b9ef9cef80bedfb2a0a4673b37bb518835c5298e530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqxmpp-doc"
RDEPENDS:${PN} += ""

inherit rpm
