SUMMARY = "A built-package format for Python"
DESCRIPTION = "A built-package format for Python. \
 \
A wheel is a ZIP-format archive with a specially formatted filename \
and the .whl extension. It is designed to contain all the files for a \
PEP 376 compatible install in a way that is very close to the on-disk \
format. Many packages will be properly installed with only the 'Unpack' \
step (simply extracting the file onto sys.path), and the unpacked archive \
preserves enough information to 'Spread' (copy data and scripts to their \
final locations) at any later time."
LICENSE = "MIT"

PV = "0.40.0"

RPM_NAME = "python311-wheel-0.40.0-1.1.noarch.rpm"
RPM_HASH = "61ab6967c32c6a6e4d80dd4ce770cc342201a3a82a25104df2d6dd14939256d998c324bdcb6b9d0b9bdaf0413316dd349314ffca13869379bf00c577e2678b32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wheel) \
python311-wheel \
python3dist(wheel)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi)"

inherit rpm
