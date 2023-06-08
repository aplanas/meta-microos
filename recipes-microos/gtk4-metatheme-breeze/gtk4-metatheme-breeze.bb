SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 4 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.4"

RPM_NAME = "gtk4-metatheme-breeze-5.27.4-2.1.noarch.rpm"
RPM_HASH = "af8544202ee983d989127cd03eee001da0956c0febfb188d9afbb63cafebfe1fac37ae4f0293f03d5aa5c39a8677afbc98fc3eedc5cbaeb4645b2a01d9c72d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-breeze"
RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm
