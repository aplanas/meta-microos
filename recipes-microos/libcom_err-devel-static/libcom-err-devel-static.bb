SUMMARY = "Development files for libcom_err, static libraries"
DESCRIPTION = "Development files for the com_err error message display library. Static libraries."
LICENSE = "MIT"

PV = "1.46.5"

RPM_NAME = "libcom_err-devel-static-1.46.5-4.3.aarch64.rpm"
RPM_HASH = "94c8b0469beec5858ef1bef36db12f2b2d3703e1c5d11df7704a20db61dfa177f87b52b53552d22cbbc44e9226ed11c896351eb186bd937e5da202937fc1c544"

RPROVIDES:${PN} += "libcom_err-devel-static libcom_err-devel-static(aarch-64) libcom_err-devel:/usr/lib64/libcom_err.a libcom_err-devel:/usr/lib64/libss.a"
RDEPENDS:${PN} += "libcom_err-devel"

inherit rpm
