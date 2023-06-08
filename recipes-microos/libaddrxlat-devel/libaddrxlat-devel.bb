SUMMARY = "Include files and libraries for libaddrxlat development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libaddrxlat."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.1+git3.g97c716a"

RPM_NAME = "libaddrxlat-devel-0.5.1+git3.g97c716a-3.1.aarch64.rpm"
RPM_HASH = "1172790d164703b2d96a5570d9f40c92ac1b4dd82176453efdc1185d561d606f2f7cd9b76f723a552fe10533ee6a5c477371df1239c708f104bfd455334bde53"

RPROVIDES:${PN} += "libaddrxlat-devel libaddrxlat-devel(aarch-64) pkgconfig(libaddrxlat)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libaddrxlat3"

inherit rpm
