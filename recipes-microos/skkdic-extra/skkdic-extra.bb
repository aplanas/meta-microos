SUMMARY = "Optional, additional dictionaries for SKK"
DESCRIPTION = "optional, additional dictionaries for SKK"
LICENSE = "GPL-2.0-or-later & SUSE-Permissive & SUSE-Public-Domain"

PV = "20160304"

RPM_NAME = "skkdic-extra-20160304-3.10.noarch.rpm"
RPM_HASH = "8e5d21d82b0e3e927227e487a4bf1114dbbf696c1927657e87db6a9a3090537b0cd2bd95880ca59622ba3fd6a4cac45583b0c23bc2baa49f19aea0b532bd4f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skkdic-extra"
RDEPENDS:${PN} += ""

inherit rpm
