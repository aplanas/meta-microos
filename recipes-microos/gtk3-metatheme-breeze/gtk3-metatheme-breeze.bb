SUMMARY = "GTK+ theme matching KDE's Breeze -- GTK+ 3 Support"
DESCRIPTION = "A GTK+ theme created to match with the new Plasma 5 Breeze theme."
LICENSE = "LGPL-2.1-only"

PV = "5.27.4"

RPM_NAME = "gtk3-metatheme-breeze-5.27.4-2.1.noarch.rpm"
RPM_HASH = "d870f400e3e5ac84565e652d935db417b81a95d11cdcd2233b36366a6b3318e35d6683d289b39b576d9d6ed44c0698699048432205afae81ca76b6c8f2f8dc7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-breeze"
RDEPENDS:${PN} += "metatheme-breeze-common"

inherit rpm
