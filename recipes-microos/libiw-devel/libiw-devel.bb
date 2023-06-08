SUMMARY = "Tools for a wireless LAN"
DESCRIPTION = "This package contains the wireless tools, used to manipulate the \
wireless extensions. The wireless extension is an interface that allows \
you to set wireless LAN specific parameters and get specific stats."
LICENSE = "GPL-2.0-only"

PV = "30.pre9"

RPM_NAME = "libiw-devel-30.pre9-40.7.aarch64.rpm"
RPM_HASH = "06acd5028f2164bb2aa316eef2884008adce6411a08e00b916e00fac5839a16920dc6a4c27807ee4b60ac16d74018fda39200b172b00a108d9f9932a2fb28fe6"

RPROVIDES:${PN} += "libiw-devel libiw-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libiw30"

inherit rpm
