SUMMARY = "Library For Reading PhotoCD Images"
DESCRIPTION = "Header files for library for reading PhotoCD images."
LICENSE = "GPL-2.0+"

PV = "1.0.1"

RPM_NAME = "libpcd-devel-1.0.1-9.28.aarch64.rpm"
RPM_HASH = "29d2b1b6395a42ad2c501ff6323deb91bebbdcd6aa649de2322d7cb927b1dc11dbf33c94cde771e176717cb565d89064c5aef277f7084b93454ca364f7809565"

RPROVIDES:${PN} += "libpcd-devel libpcd-devel(aarch-64)"
RDEPENDS:${PN} += "libpcd2"

inherit rpm
