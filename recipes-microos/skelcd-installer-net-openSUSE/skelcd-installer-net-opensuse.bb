SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.86"

RPM_NAME = "skelcd-installer-net-openSUSE-17.86-1.29.aarch64.rpm"
RPM_HASH = "84094a93d5b4370e4075c14a88a12602b3872a9b37f8ac2a6c7b3e3b8a852a4028465de8f1502018d9ef3b18f2c97df6e3c0eb83cbce6ecc139c5d13ca3e467b"

RPROVIDES:${PN} += "skelcd-installer skelcd-installer-net-openSUSE skelcd-installer-net-openSUSE(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
