SUMMARY = "Header files for wv"
DESCRIPTION = "Header files for wv."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "wv-devel-1.2.9-2.9.aarch64.rpm"
RPM_HASH = "43bc09f2f805ad852b323df2dd4fed99ca8856671602b98aba7ac56a7608396d8d746abcb2087e961d0314577fe11b6f0394352618908a322413a0f1102874e5"

RPROVIDES:${PN} += "pkgconfig(wv-1.0) wv-devel wv-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgsf-devel libwmf-devel libwv-1_2-4 pkgconfig(libgsf-1)"

inherit rpm
