SUMMARY = "Monospace terminal fonts from Microsoft"
DESCRIPTION = "Cascadia Code is a monospaced font that was designed also with Visual Studio / Visual Studio Code in mind."
LICENSE = "OFL-1.1"

PV = "2102.25"

RPM_NAME = "saja-cascadia-code-fonts-2102.25-1.7.noarch.rpm"
RPM_HASH = "86dbdeb340f1e07a5ded333b046f184e982c67429d98e7fb99a1b2568915a3fe493f0284efb8c3b67c68f7643843307e188683c10b044e35715e224f2b13ddf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saja-cascadia-code-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
