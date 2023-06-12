SUMMARY = "Python wrapper for Adobe's PostScript autohinter"
DESCRIPTION = "Python wrapper for Adobe's PostScript autohinter"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python310-psautohint-2.4.0-1.9.aarch64.rpm"
RPM_HASH = "8e104c6b0c2ef3d2f9d6e85606795144296164c9a811e80cc9db2cca610848fa74b1da0d3fab5a66597543ca24f197e69bdeb669396a27f48af918ffb7cfc73d"

RPROVIDES:${PN} += "python3-psautohint \
python3.10dist(psautohint) \
python310-psautohint \
python310-psautohint(aarch-64) \
python3dist(psautohint)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-FontTools \
python310-fs \
update-alternatives"

inherit rpm
