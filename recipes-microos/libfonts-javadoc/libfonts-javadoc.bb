SUMMARY = "Javadoc for libfonts"
DESCRIPTION = "Javadoc for libfonts."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libfonts-javadoc-1.1.6-1.4.noarch.rpm"
RPM_HASH = "914bcc987bbe9f91912ac50f850ae846e978542ab3a380910e83a0bc0287809479873753d8a5dced86d82f99b2b64fb2d42fe43f2b6f24103ccb10824f94e3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfonts-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
