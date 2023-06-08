SUMMARY = "Translation of man pages in Greek"
DESCRIPTION = "This package provides translations of man pages in Greek."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-el-4.18.1-1.1.noarch.rpm"
RPM_HASH = "b08f5fe5cbf92eafd29f2569922da9b1f4392431fe72dc6418f3de8b4f3f1b1293dd74a8f42b4a9db8be1c837051b764124a7887c87f1a871133308023dc423a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:el) man-pages-el"
RDEPENDS:${PN} += "man-pages"

inherit rpm
