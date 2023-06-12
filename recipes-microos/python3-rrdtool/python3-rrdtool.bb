SUMMARY = "Python bindings for RRDtool"
DESCRIPTION = "Python RRDtool bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "python3-rrdtool-1.8.0-3.1.aarch64.rpm"
RPM_HASH = "6e9275e80b6916ef4f7cd132d9a90249682bfd4e66eb85a66e456c8832b9d9539078d7d368fbbebf6d854905d10996f073cc039a017c4b37719393b0fd0a5f42"

RPROVIDES:${PN} += "python3-rrdtool \
python3-rrdtool(aarch-64) \
python3.10dist(rrdtool) \
python3dist(rrdtool)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
librrd.so.8()(64bit) \
python(abi) \
python3 \
rrdtool"

inherit rpm
