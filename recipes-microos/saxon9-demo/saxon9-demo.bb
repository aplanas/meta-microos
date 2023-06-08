SUMMARY = "Demos for saxon9"
DESCRIPTION = "Demonstrations and samples for saxon9."
LICENSE = "Apache-2.0 & MPL-1.0"

PV = "9.4.0.7"

RPM_NAME = "saxon9-demo-9.4.0.7-16.6.noarch.rpm"
RPM_HASH = "745e0955a34297d19ea9dc363ebf629e3befccda7b72555ea63c74f26ed6eebc3d56c6a14c329e14c866a5834d52963e00bac2d120d12e1b5ddf949055732db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon9-demo"
RDEPENDS:${PN} += "saxon9"

inherit rpm
