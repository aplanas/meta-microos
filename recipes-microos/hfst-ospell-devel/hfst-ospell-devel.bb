SUMMARY = "HFST spell checker development files"
DESCRIPTION = "Development headers and libraries for hfst-ospell"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "hfst-ospell-devel-0.5.1-4.3.aarch64.rpm"
RPM_HASH = "65f8db6cb3305b524c8c9b85210243962ffac60ab4dc876c3b6b08866642f425e2ef5a2c7cc14dd3edcf13175d41c4067b162e96eb9176399fe6be8d7e986574"

RPROVIDES:${PN} += "hfst-ospell-devel hfst-ospell-devel(aarch-64) pkgconfig(hfstospell)"
RDEPENDS:${PN} += "/usr/bin/pkg-config hfst-ospell"

inherit rpm
