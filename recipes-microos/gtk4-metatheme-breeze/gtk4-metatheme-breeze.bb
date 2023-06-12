SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 4 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.5"

RPM_NAME = "gtk4-metatheme-breeze-5.27.5-1.1.noarch.rpm"
RPM_HASH = "ca38d8f73a2ae4d2cb2b27bd34ff03fd2b4e831c70feae83bbb38cefb4e41d74232730cb51e396fc5b49e5ee490445b956192d40058771b53d298e7e5130eb0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-breeze"
RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm
