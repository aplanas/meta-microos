SUMMARY = "Documentation for the liblouis braille translator"
DESCRIPTION = "liblouis is a translator from and to braille. It features support for \
computer and literary braille, supports contracted and uncontracted \
translation for many languages and has support for hyphenation."
LICENSE = "LGPL-3.0-or-later"

PV = "3.25.0"

RPM_NAME = "liblouis-doc-3.25.0-1.1.aarch64.rpm"
RPM_HASH = "c71608d728fbe03ec43b3f3b712a74534c329ab9dc175ed3ee03c81ab41b774b5a8686623cec6d459511b9fb9561ccde8d11dd4ee526c205999e8206bf9273b5"

RPROVIDES:${PN} += "liblouis-doc liblouis-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
