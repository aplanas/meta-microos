SUMMARY = "Documentation for notmuch"
DESCRIPTION = "This package contains the info pages for notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "notmuch-doc-0.37-2.4.aarch64.rpm"
RPM_HASH = "6e150f55d6c78e6f636a007eb001e880725590ff41322476f436ac59a6f6cfca6099ae6e93adc10bbd3aadbe3ab835c2be801bcf5dfc56febf406b9287b83586"

RPROVIDES:${PN} += "notmuch-doc notmuch-doc(aarch-64)"
RDEPENDS:${PN} += "notmuch"

inherit rpm
